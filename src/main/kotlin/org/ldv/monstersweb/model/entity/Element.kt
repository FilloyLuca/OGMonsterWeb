package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity

class Element(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    open val nom : String
) {
}