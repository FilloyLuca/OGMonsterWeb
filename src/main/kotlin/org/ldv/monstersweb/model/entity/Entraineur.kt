package org.ldv.monstersweb.model.entity
import jakarta.persistence.*

@Entity
class Entraineur(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    open var id: Int? = null,
    open var nom: String,
    open var argents: Int,
    @OneToMany(mappedBy = "entraineur")
    open var equipeMonstre : MutableList<IndividuMonstre> = mutableListOf(),
    @OneToMany(mappedBy = "entraineur")
    open var boiteMonstre: MutableList<IndividuMonstre> = mutableListOf(),
    @OneToMany
    var sacAItems: MutableList<MonsterKube> = mutableListOf()
) {
}