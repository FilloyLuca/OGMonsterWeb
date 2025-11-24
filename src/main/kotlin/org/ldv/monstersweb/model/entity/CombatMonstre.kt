package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity
class CombatMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    @ManyToOne
    open var monstreJoueur : IndividuMonstre,
    @ManyToOne
    open var monstreSauvage : IndividuMonstre,
    open var round : Int = 1
) {
}