package org.ldv.monstersweb.model.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "monster_kube")
class MonsterKube (
    id : Int?,
    nom : String,
    description : String,
    open var chanceCapture : Double,

) : Item(id,nom,description) {
}

