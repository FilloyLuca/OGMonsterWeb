package org.ldv.monstersweb.model.entity
import jakarta.persistence.*
import org.ldv.monstersweb.model.entity.Element

@Entity
class Technique(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    open val nom : String,
    open val precisionRate : Double, //(taux pas rater)
    open val multiplicateurDePuissance : Double,
    open val estBuff : Boolean,
    open val estDebuff : Boolean,
    open val estSpecial : Boolean,
    open val faireDegat : Boolean,
    @ManyToOne
    @JoinColumn(name = "element_id")
    open var elementTechnique: Element? = null,
    @ManyToMany(mappedBy = "techniques")
    open var individus: MutableList<IndividuMonstre> = mutableListOf()

) {
}