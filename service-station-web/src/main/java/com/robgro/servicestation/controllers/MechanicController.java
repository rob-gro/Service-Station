package com.robgro.servicestation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/mechanics")
@Controller
public class MechanicController {

    @RequestMapping({"","/","/index", "/index.html"})
    public String listMechanics() {
        return "mechanics/index";
    }
}
