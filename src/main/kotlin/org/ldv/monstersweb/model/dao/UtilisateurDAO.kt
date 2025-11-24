package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Utilisateur
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UtilisateurDAO : JpaRepository<Utilisateur, Int> {

    @Query("select u from Utilisateur u where u.email = ?1")
    fun findByEmail(email: String): Utilisateur?
    fun nom(nom: String): MutableList<Utilisateur>
}
