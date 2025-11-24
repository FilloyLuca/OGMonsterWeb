package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.CombatMonstre
import org.springframework.data.jpa.repository.JpaRepository

interface CombatMonstreDAO : JpaRepository<CombatMonstre, Int> {
}
