package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Technique
import org.springframework.data.jpa.repository.JpaRepository

interface TechniqueDAO : JpaRepository<Technique, Int> {
}
