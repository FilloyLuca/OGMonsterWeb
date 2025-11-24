package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity
class Zone(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open var id : Int?,
    open var nom : String,
    open var expZone : Int,
    @ManyToMany(mappedBy = "zones")
    open var especeMonstres : MutableList<EspeceMonstre> = mutableListOf(),
    @ManyToOne
    open var zoneSuivante : Zone? = null,
    @ManyToOne
    open var zonePrecedente : Zone? = null,
    @OneToMany(mappedBy = "zone")
    open var monstres: MutableList<IndividuMonstre> = mutableListOf()
) {
}