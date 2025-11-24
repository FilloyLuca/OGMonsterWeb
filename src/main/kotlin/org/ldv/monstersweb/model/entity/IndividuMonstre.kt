package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity
class IndividuMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open var id : Int?,
    open var nom : String,
    @ManyToOne
    open var espece : EspeceMonstre,
    @ManyToOne
    open var entraineur : Entraineur? = null,
    open var expInit : Double = 0.0,
    @ManyToMany
    @JoinTable(
        name = "individu_technique",
        joinColumns = [JoinColumn(name = "individu_id")],
        inverseJoinColumns = [JoinColumn(name = "technique_id")]
    )
    open var techniques: MutableList<Technique> = mutableListOf(),
    @ManyToOne
    @JoinColumn(name = "zone_id")
    open var zone: Zone? = null



) {
}