package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity

class EspeceMonstre(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    open val nom : String,
    open val type : String,
    open val baseAttaque : Int,
    open val baseDefense : Int,
    open val baseVitesse : Int,
    open val baseAttaqueSpe : Int,
    open val baseDefenseSpe : Int,
    open val basePv : Int,
    open val modAttaque : Double,
    open val modDefense : Double,
    open val modVitesse : Double,
    open val modAttaqueSpe : Double,
    open val modDefenseSpe : Double,
    open val modPv : Double,
    open val description : String,
    open val particularites : String,
    open val caractères : String,
    @ManyToMany
    @JoinTable(
        name = "espece_element",
        joinColumns = [JoinColumn(name = "espece_id")],
        inverseJoinColumns = [JoinColumn(name = "element_id")]
    )
    open val elements : MutableList<Element>,
    @ManyToMany
    @JoinTable(
        name = "espece_monstre_zone",
        joinColumns = [JoinColumn(name = "espece_id")],
        inverseJoinColumns = [JoinColumn(name = "zone_id")]
    )
    open var zones : MutableList<Zone> = mutableListOf()
) {
}