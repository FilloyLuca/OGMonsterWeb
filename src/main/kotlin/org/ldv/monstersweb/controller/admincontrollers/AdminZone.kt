package org.ldv.monstersweb.controller.admincontrollers

import org.ldv.monstersweb.model.dao.ZoneDAO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminZoneController (val zoneDAO : ZoneDAO){

    @GetMapping("/admin/zones")
    open fun index(model: Model):String{
        var zoneList = zoneDAO.findAll()
        model.addAttribute("zones", zoneList)

        return "pagesAdmin/zones/indexZone"
    }
}