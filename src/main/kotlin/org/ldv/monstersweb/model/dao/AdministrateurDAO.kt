package org.ldv.monstersweb.model.entity

import org.ldv.monstersweb.model.entity.Administrateur
import org.springframework.data.jpa.repository.JpaRepository

interface AdministrateurDAO : JpaRepository<Administrateur, Int> {
}


