package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Item
import org.springframework.data.jpa.repository.JpaRepository

interface ItemDAO : JpaRepository<Item, Int> {
}
