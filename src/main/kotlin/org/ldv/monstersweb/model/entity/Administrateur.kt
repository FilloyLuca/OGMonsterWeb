package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity
class Administrateur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    open val nom : String,
) {
}