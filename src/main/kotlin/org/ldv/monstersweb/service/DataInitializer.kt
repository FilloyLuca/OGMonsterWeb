package org.ldv.monstersweb.service
import org.ldv.monstersweb.model.entity.EspeceMonstre
import org.ldv.monstersweb.model.entity.Element
import org.ldv.monstersweb.model.entity.Technique
import org.ldv.monstersweb.model.entity.Zone
import org.ldv.monstersweb.model.dao.ElementDAO
import org.ldv.monstersweb.model.dao.EspeceMonstreDAO
import org.ldv.monstersweb.model.dao.MonsterKubeDAO
import org.ldv.monstersweb.model.dao.RoleDAO
import org.ldv.monstersweb.model.dao.TechniqueDAO
import org.ldv.monstersweb.model.dao.UtilisateurDAO
import org.ldv.monstersweb.model.dao.ZoneDAO
import org.ldv.monstersweb.model.entity.MonsterKube
import org.ldv.monstersweb.model.entity.Role
import org.ldv.monstersweb.model.entity.Utilisateur
import org.springframework.boot.CommandLineRunner
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component

@Component
class DataInitializer(
    private val elementDAO : ElementDAO,
    private val especesMonstreDAO : EspeceMonstreDAO,
    private val techniqueDAO: TechniqueDAO,
    private val zoneDAO: ZoneDAO,
    private val monsterKubeDAO: MonsterKubeDAO,
    private val roleDAO : RoleDAO,
    private val utilisateurDAO: UtilisateurDAO,
    private val passwordEncoder: PasswordEncoder
    ) : CommandLineRunner {
    override fun run(vararg args: String?) {

        // Vérifie si la base contient déjà des données
        if (elementDAO.count() > 0 || especesMonstreDAO.count() > 0 || techniqueDAO.count() > 0 || zoneDAO.count() > 0 || monsterKubeDAO.count() > 0) {
            println("ℹ️ Données déjà présentes, initialisation ignorée.")
            return
        }

        println("🚀 Initialisation des données...")

        // === Elements ===
        val plante = Element(null,"Plante")
        val feu = Element(null,"Feu")
        val eau = Element(null,"Eau")
        val insecte = Element(null,"Insecte")
        val roche = Element(null,"Roche")
        val normal = Element(null,"Normal")

        // === Sauvegarde des Elements ===
        elementDAO.saveAll(listOf(plante, feu, eau, insecte, roche, normal))


        // === EspecesMonstres ===
        val especeSpringLeaf = EspeceMonstre(
            null,
            "Springleaf",
            "Graine",
            60,
            9,
            11,
            10,
            12,
            50,
            34.0,
            6.5,
            9.0,
            8.0,
            7.0,
            30.0,
            "Petit monstre espiègle rond comme une graine, adore le soleil.",
            "Sa feuille sur la tête indique son humeur.",
            "Curieux, amical, timide",
            mutableListOf(plante)
        )
        val especeFlamkip = EspeceMonstre(
            null,
            "Flamkip",
            "Animal ",
            50,
            8,
            13,
            13,
            16,
            7,
            22.0,
            10.0,
            5.5,
            9.5,
            9.5,
            6.5,
            "Petit animal entouré de flammes, déteste le froid.",
            "Sa flamme change d’intensité selon son énergie.",
            "Impulsif, joueur, loyal",
            mutableListOf(feu)
        )
        val especeAquamy = EspeceMonstre(
            null,
            "Aquamy",
            "Meteo",
            14,
            10,
            11,
            9,
            14,
            14,
            7.0,
            9.0,
            10.0,
            7.5,
            12.0,
            12.0,
            "Créature vaporeuse semblable à un nuage, produit des gouttes pures.",
            "Fait baisser la température en s’endormant.",
            "Calme, rêveur, mystérieux",
            mutableListOf(eau)
        )
        val espespeceLaoumi = EspeceMonstre(
            null,
            "Laoumi",
            "Animal",
            11,
            10,
            9,
            8,
            11,
            23,
            11.0,
            8.0,
            7.0,
            6.0,
            11.5,
            23.0,
            "Petit ourson au pelage soyeux, aime se tenir debout.",
            "Son grognement est mignon mais il protège ses amis.",
            "Affectueux, protecteur, gourmand",
            mutableListOf(normal)
        )
        val especeBugsyface = EspeceMonstre(
            null,
            "Bugsyface",
            "Insecte",
            10,
            13,
            8,
            7,
            13,
            45,
            7.0,
            11.0,
            6.5,
            8.0,
            11.5,
            21.0,
            "Insecte à carapace luisante, se déplace par bonds et vibre des antennes.",
            "Sa carapace devient plus dure après chaque mue.",
            "Travailleur, sociable, infatigable",
            mutableListOf(insecte)
        )
        val especeGalum  = EspeceMonstre(
            null,
            "Galum",
            "Minéral",
            12,
            15,
            6,
            8,
            12,
            55,
            9.0,
            13.0,
            4.0,
            6.5,
            10.5,
            13.0,
            "Golem ancien de pierre, yeux lumineux en garde.",
            "Peut rester immobile des heures comme une statue.",
            "Sérieux, stoïque, fiable",
            mutableListOf(roche)
        )
        val especeEmperior = EspeceMonstre(
            null,
            "Emperior",
            "Draconique",
            25,
            15,
            3,
            14,
            10,
            95,
            14.0,
            12.0,
            3.0,
            11.5,
            8.6,
            9.0,
            "Dragon colossal d’écailles ardentes, souffle de feu et regard perçant.",
            "Ses ailes déployées il couvrent le ciel.",
            "Fier, puissant, sage.",
            mutableListOf(feu,roche)
        )

        // === Sauvegarde des EspeceMonstres ===
        especesMonstreDAO.saveAll(listOf(especeSpringLeaf, especeFlamkip, especeAquamy,espespeceLaoumi, especeBugsyface, especeGalum, especeEmperior))

        // === techniques ===
        // ⚪ Normal
        val charge = Technique(
            id = null,
            nom = "Charge",
            precisionRate = 95.0,
            multiplicateurDePuissance = 1.0,
            estSpecial = false,
            estBuff = false,
            estDebuff = false,
            faireDegat = true,
            elementTechnique = normal
        )

        // 🔥 Feu
        val flammeche = Technique(
            id = null,
            nom = "Flammèche",
            precisionRate = 90.0,
            multiplicateurDePuissance = 1.2,
            estSpecial = true,
            estBuff = false,
            estDebuff = false,
            faireDegat = true,
            elementTechnique = feu
        )

        // 🌱 Plante
        val fouetLianes = Technique(
            id = null,
            nom = "Fouet-Lianes",
            precisionRate = 85.0,
            multiplicateurDePuissance = 1.0,
            estSpecial = true,
            estBuff = false,
            estDebuff = false,
            faireDegat = true,
            elementTechnique = plante
        )

        // 💧 Eau
        val bulleDEau = Technique(
            id = null,
            nom = "Bulle d'o",
            precisionRate = 90.0,
            multiplicateurDePuissance = 1.0,
            estSpecial = true,
            estBuff = false,
            estDebuff = false,
            faireDegat = true,
            elementTechnique = eau
        )

        // 🐞 Insecte
        val piqure = Technique(
            id = null,
            nom = "Piqure",
            precisionRate = 80.0,
            multiplicateurDePuissance = 1.0,
            estSpecial = true,
            estBuff = false,
            estDebuff = false,
            faireDegat = true,
            elementTechnique = insecte
        )

        // 🪨 Roche
        val tomberoche = Technique(
            id = null,
            nom = "Tomberoche",
            precisionRate = 85.0,
            multiplicateurDePuissance = 1.0,
            estSpecial = false,
            estBuff = false,
            estDebuff = false,
            faireDegat = true,
            elementTechnique = roche
        )

        // === Sauvegarde des Techniques ===
        techniqueDAO.saveAll(listOf(charge, flammeche, fouetLianes, bulleDEau, piqure, tomberoche))

        // === Zones ===
        var route1 = Zone(
            null,
            "Route 1",
            1500,
            mutableListOf(especeSpringLeaf)
        )
        var route2 = Zone(
            null,
            "Route 2",
            2000,
            mutableListOf(especeSpringLeaf,especeAquamy)
        )
        var route3 = Zone(
            id = null,
            "route3",
            2500,
            mutableListOf(especeEmperior,especeFlamkip)
        )

        // === Sauvegarde des Zones ===
        zoneDAO.saveAll(listOf(route1,route2,route3))

        // === MonsterKube ===
        val monsterKubes = (1..10).map { i ->
            MonsterKube(
                id = null,
                nom = "MonsterKube",
                description = "Dispositif permettant la capture de monstre",
                50.0
            )
        }

        // === Sauvegarde des MonsterKube ===
        monsterKubeDAO.saveAll(monsterKubes)

        // === Roles ===
        // ROLE
        val roleAdmin = Role(
            nom = "ADMIN"
        )

        val roleClient = Role(
            nom = "CLIENT"
        )

        // === Sauvegarde des Roles ===
        roleDAO.saveAll(listOf(roleAdmin, roleClient))

        //=== Utilisateurs ===
        val admin = Utilisateur(
            id = null,
            nom = "Super",
            prenom = "Admin",
            email = "admin@admin.com",
            mdp = passwordEncoder.encode("admin123"), // mot de passe hashé
            role = roleAdmin
        )


        val client = Utilisateur(
            id = null,
            nom = "Jean",
            prenom = "Client",
            email = "client@client.com",
            mdp = passwordEncoder.encode("client123"), // mot de passe hashé
            role = roleClient
        )

        // === Sauvegarde des Utilisateurs ===
        utilisateurDAO.saveAll(listOf(admin, client))


        // === Insertion ===
        println("✅ Données initiales insérées : ${elementDAO.count()} Elements, ${especesMonstreDAO.count()} Especes de Monstre, ${techniqueDAO.count()} Technique, ${zoneDAO.count()} Zone, ${monsterKubeDAO.count()} MonsterKube, ${roleDAO.count()} Roles, ${utilisateurDAO.count()} Utilisateurs")
    }
}