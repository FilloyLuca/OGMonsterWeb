package org.ldv.monstersweb.model.dao

import org.springframework.data.jpa.repository.JpaRepository
import org.ldv.monstersweb.model.entity.Role

interface RoleDAO : JpaRepository<Role, Int> {
}
