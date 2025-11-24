package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@MappedSuperclass
class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    open val nom : String,
    open val description : String
) {
}