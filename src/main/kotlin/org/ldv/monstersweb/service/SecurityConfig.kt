//package org.ldv.monstersweb.service
//
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.security.authentication.AuthenticationManager
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
//import org.springframework.security.config.annotation.web.builders.HttpSecurity
//import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer
//import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
//import org.springframework.security.crypto.password.PasswordEncoder
//import org.springframework.security.web.SecurityFilterChain
//
//@Configuration
//@EnableMethodSecurity
//class SecurityConfig {
//
//    @Bean
//    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()
//
//    @Bean
//    fun filterChain(http: HttpSecurity): SecurityFilterChain {
//        http
//            .csrf { it.disable() } //TODO Retirer cette ligne
//            //Restriction des endpoints en fonction du role
//            .authorizeHttpRequests {
//                // Autoriser l'accès public à la page d'accueil et aux pages visiteurs
//                it.requestMatchers( "/", "/monstersweb", "/monstersweb/index", "/monstersweb/register", "/monstersweb/login", "/css/**", "/js/**", "/img/**", "/favicon.ico").permitAll()
//                    // Autoriser l'accès pour les utilisateurs avec le rôle "ADMIN" à /admin/**
//                    .requestMatchers("/monstersweb/admin/**").hasRole("ADMIN")
//                    // Autoriser l'accès pour les utilisateurs avec le rôle "CLIENT" à /client/**
//                    .requestMatchers("/monstersweb/client/**").hasRole("CLIENT")
//                    // Toutes les autres requêtes doivent être authentifiées
//                    .anyRequest().authenticated()
//            }
//            // Configuration du formulaire de connexion
//            .formLogin { form: FormLoginConfigurer<HttpSecurity?> ->
//                form
//                    .loginPage("/monstersweb/login")
//                    .loginProcessingUrl("/monstersweb/login")
//                    .defaultSuccessUrl("/monstersweb/profil")
//                    .failureUrl("/monstersweb/login?error=true")
//                    .permitAll()
//            }
//
//            // Configuration du mécanisme de déconnexion
//            .logout { logout: LogoutConfigurer<HttpSecurity?> ->
//                logout
//                    .logoutUrl("/monstersweb/logout")
//                    .logoutSuccessUrl("/")
//                    .permitAll()
//            }
//
//        return http.build()
//    }
//
//    @Bean
//    fun authenticationManager(config: AuthenticationConfiguration): AuthenticationManager {
//        return config.authenticationManager
//    }
//}


package org.ldv.monstersweb.service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.util.matcher.AntPathRequestMatcher

@Configuration
@EnableMethodSecurity
class SecurityConfig {

    @Bean
    fun passwordEncoder(): PasswordEncoder = BCryptPasswordEncoder()

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() } //TODO Retirer cette ligne
            // Restriction des endpoints en fonction du role
            .authorizeHttpRequests { auth ->
                auth
                    // Pages publiques accessibles sans authentification
                    .requestMatchers("/", "/monstersweb", "/monstersweb/login", "/monstersweb/register", "/css/**", "/js/**", "/img/**", "/favicon.ico").permitAll()
                    // Pages admin - accessible uniquement par ADMIN
                    .requestMatchers("/monstersweb/admin/**").hasRole("ADMIN")
                    // Pages client - accessible uniquement par CLIENT
                    .requestMatchers("/monstersweb/client/**").hasRole("CLIENT")
                    // Toutes les autres requêtes nécessitent une authentification
                    .anyRequest().authenticated()
            }
            // Configuration du formulaire de connexion
            .formLogin { form ->
                form
                    .loginPage("/monstersweb/login")           // Page de login (GET)
                    .loginProcessingUrl("/monstersweb/login")  // URL de traitement (POST)
                    .usernameParameter("username")             // Nom du champ username
                    .passwordParameter("password")             // Nom du champ password
                    .defaultSuccessUrl("/monstersweb/profil", true) // Redirection après succès
                    .failureUrl("/monstersweb/login?error=true")    // Redirection en cas d'échec
                    .permitAll()
            }
            // Configuration du mécanisme de déconnexion
            .logout { logout ->
                logout
                    .logoutRequestMatcher(AntPathRequestMatcher("/monstersweb/logout"))
                    .logoutSuccessUrl("/monstersweb/login")
                    .invalidateHttpSession(true)
                    .deleteCookies("JSESSIONID")
                    .permitAll()
            }

        return http.build()
    }

    @Bean
    fun authenticationManager(config: AuthenticationConfiguration): AuthenticationManager {
        return config.authenticationManager
    }
}
