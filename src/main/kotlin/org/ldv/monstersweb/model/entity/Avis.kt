package org.ldv.monstersweb.model.entity
import java.time.LocalDate
import jakarta.persistence.*

@Entity
class Avis(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open val id : Int?,
    open val nom : String,
    open val date : LocalDate,
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    open var utilisateur: Utilisateur? = null

) {
}