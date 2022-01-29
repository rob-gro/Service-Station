package com.robgro.servicestation.controllers;

import com.robgro.servicestation.services.MechanicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mechanics")
@Controller
public class MechanicController {

    private final MechanicService mechanicService;

    public MechanicController(MechanicService mechanicService) {
        this.mechanicService = mechanicService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listMechanics(Model model) {
        model.addAttribute("mechanics", mechanicService.findAll());
        return "mechanics/index";
    }
}