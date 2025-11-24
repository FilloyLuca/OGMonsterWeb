package org.ldv.monstersweb.controller.admincontrollers

import org.ldv.monstersweb.model.dao.MonsterKubeDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminKubeController (val monsterKubeDAO : MonsterKubeDAO){

    @GetMapping("/admin/monsterkube")
    open fun index(model: Model):String{
        var monsterKubeList = monsterKubeDAO.findAll()
        model.addAttribute("monsterKube", monsterKubeList)

        return "pagesAdmin/monsterkube/indexMonsterKube"
    }
}