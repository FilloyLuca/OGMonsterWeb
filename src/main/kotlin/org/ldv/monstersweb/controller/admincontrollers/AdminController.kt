
package org.ldv.monstersweb.controller.admincontrollers

import org.ldv.monstersweb.model.dao.EspeceMonstreDAO
import org.ldv.monstersweb.model.dao.MonsterKubeDAO
import org.ldv.monstersweb.model.dao.ZoneDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/monstersweb/admin")
class AdminController(private val monsterKubeDAO: MonsterKubeDAO, private val especeMonstreDAO: EspeceMonstreDAO, private val zoneDAO: ZoneDAO) {

    @GetMapping("/dashboard")
    fun dashboard(): String {
        return "pagesAdmin/dashboard"
    }

    @GetMapping("/indexEspeceMonstre")
    fun users(): String {
        return "pagesAdmin/especemonstres/indexEspeceMonstre"
    }

    @GetMapping("/indexZone")
    fun users2(): String {
        return "pagesAdmin/zones/indexZone"
    }

    @GetMapping("/indexMonsterKube")
    fun users3(): String {
        return "pagesAdmin/monsterkube/indexMonsterKube"
    }

    @GetMapping("/monstersweb/admin/monsterkube")
    fun listMonsterKubes(model: Model): String {
        val monsterKubes = monsterKubeDAO.findAll() // récupère tous les MonsterKube
        model.addAttribute("monsterKube", monsterKubes) // ⚠️ Nom utilisé dans le template
        return "pagesAdmin/monsterkube/indexMonsterKube"
    }

    @GetMapping("/monstersweb/admin/especemonstre")
    fun listEspeceMonstres(model: Model): String {
        val monsterKubes = especeMonstreDAO.findAll() // récupère tous les MonsterKube
        model.addAttribute("especesMonstre", monsterKubes) // ⚠️ Nom utilisé dans le template
        return "pagesAdmin/especemonstres/indexEspeceMonstre"
    }

    @GetMapping("/monstersweb/admin/zones")
    fun listeZones(model: Model): String {
        val zones = zoneDAO.findAll() // récupère tous les MonsterKube
        model.addAttribute("zones", zones) // ⚠️ Nom utilisé dans le template
        return "pagesAdmin/zones/indexZone"
    }
}
