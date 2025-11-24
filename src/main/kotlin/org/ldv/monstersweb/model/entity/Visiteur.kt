package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity
class Visiteur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open var id : Int?
) {
}