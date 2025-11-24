package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Avis
import org.springframework.data.jpa.repository.JpaRepository

interface AvisDAO : JpaRepository<Avis, Int> {
}

