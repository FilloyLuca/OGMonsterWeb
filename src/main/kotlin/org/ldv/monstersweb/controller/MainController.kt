package org.ldv.monstersweb.controller
import ch.qos.logback.core.net.server.Client
import org.ldv.monstersweb.controller.clientcontrollers.ClientController
import org.ldv.monstersweb.model.dao.UtilisateurDAO
import org.ldv.monstersweb.model.entity.Administrateur
import org.ldv.monstersweb.service.DataInitializer
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class MainController(private val dataInitializer: DataInitializer, private val utilisateurDAO: UtilisateurDAO) {

    /**
     * Page d'accueil accessible à tous (GET /)
     */
    @GetMapping("/")
    fun home(): String {
        return "index"
    }

    /**
     * Page d'accueil accessible à tous (GET /monstersweb)
     */
    @GetMapping("/monstersweb")
    fun monsterswebHome(): String {
        return "index"
    }

    /**
     * Affiche le formulaire de connexion (GET /monstersweb/login)
     * Le traitement POST est géré automatiquement par Spring Security
     */
    @GetMapping("/monstersweb/login")
    fun login(@RequestParam(required = false) error: String?, model: Model): String {
        // Ajoute un attribut "error" si présent dans l'URL
        if (error != null) {
            model.addAttribute("error", true)
        }
        return "pagesVisiteur/login"
    }

    /**
     * Page de profil après connexion
     */
    @GetMapping("/monstersweb/profil")
    fun profil(authentication: Authentication): String {
        // Récupération des rôles (authorities) de l'utilisateur connecté
        val roles = authentication.authorities.map { it.authority }

        // Si l'utilisateur est admin → redirection vers le dashboard
        if ("ROLE_ADMIN" in roles) {
            return "redirect:/monstersweb/admin/dashboard"
        }

        // Sinon → affiche la page profile client
        return "pagesClient/AccueilClient"
    }

    @GetMapping("/monstersweb/compte")
    fun compte(authentication: Authentication, model: Model): String {

        val roles = authentication.authorities.map { it.authority }

        if ("ROLE_ADMIN" in roles) {
            return "redirect:/monstersweb/admin/compteAdmin"
        }

        val email = authentication.name

        // Vérifier si le client existe
        val client = utilisateurDAO.findByEmail(email)
            ?: return "redirect:/monstersweb/login?error=true" // Redirection en cas d'erreur (email introuvable)

        model.addAttribute("Client", client)

        return "pagesClient/compteClient"
    }

}

