package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Visiteur
import org.springframework.data.jpa.repository.JpaRepository

interface VisiteurDAO : JpaRepository<Visiteur, Int> {
}
