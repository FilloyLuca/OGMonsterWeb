package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Entraineur
import org.springframework.data.jpa.repository.JpaRepository

interface EntraineurDAO : JpaRepository<Entraineur, Int> {
}
