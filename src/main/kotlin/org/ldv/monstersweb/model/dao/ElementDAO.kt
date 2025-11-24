package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Element
import org.springframework.data.jpa.repository.JpaRepository

interface ElementDAO : JpaRepository<Element, Int> {
}
