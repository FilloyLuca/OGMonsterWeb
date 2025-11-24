package org.ldv.monstersweb.model.dao

import org.ldv.monstersweb.model.entity.Zone
import org.springframework.data.jpa.repository.JpaRepository

interface ZoneDAO : JpaRepository<Zone, Int> {
}
