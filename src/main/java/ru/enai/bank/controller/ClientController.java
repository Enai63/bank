package ru.enai.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.enai.bank.domain.Client;
import ru.enai.bank.service.ClientService;


@Controller
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public String getClients(Model model) {
        model.addAttribute("clients", clientService.getClients());
        return "client";
    }

    @GetMapping("add")
    public String formClient(Model model) {
        model.addAttribute("client", new Client());
        return "add";
    }

    @PostMapping("add")
    public String addClient(@ModelAttribute("client") Client client) {
        clientService.saveClient(client);
        return "add";
    }


}
