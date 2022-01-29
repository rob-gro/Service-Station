package com.robgro.servicestation.controllers;

import com.robgro.servicestation.services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/clients")
@Controller
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listClients(Model model) {
        model.addAttribute("clients", clientService.findAll());
        return "clients/index";
    }

    @RequestMapping("/find")
    public String findClients() {
        return "clients/notimplementedyet";
    }
}