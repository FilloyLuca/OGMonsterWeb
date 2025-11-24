package org.ldv.monstersweb.controller.admincontrollers

import org.ldv.monstersweb.model.dao.EspeceMonstreDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminEspeceController (val especeMonstreDAO : EspeceMonstreDAO){

    @GetMapping("/admin/especemonstres")
    open fun index(model: Model):String{
        var especeMonstreList = especeMonstreDAO.findAll()
        model.addAttribute("especeMonstre", especeMonstreList)

        return "pagesAdmin/especemonstres/indexEspeceMonstre"
    }
}