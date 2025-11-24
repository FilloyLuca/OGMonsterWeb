package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.CombatMonstre
import org.ldv.monstersweb.model.entity.MonsterKube
import org.springframework.data.jpa.repository.JpaRepository

interface MonsterKubeDAO : JpaRepository<MonsterKube, Int> {
}