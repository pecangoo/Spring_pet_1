package com.example.simple.controller;

import com.example.simple.model.Client;
import com.example.simple.repository.ClientRepository;
import com.example.simple.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService =  clientService;
    }

    @GetMapping("/add")
    public String add(){
        return "addClient";
    }


    @PostMapping("/add")
    public String add(@ModelAttribute("Client") Client client) {
        clientService.addClient(client);
        return "redirect:/clients/add";
    }


    @GetMapping("/clientlist")
    public String clientList(Model model){
        List<Client> clientList = clientService.getAllClient();
        System.out.println(clientList.toString());
        //model.addAllAttributes(clientList);

        model.addAttribute(clientList);
        return "clientList";
    }

    @PostMapping("/delete")
    public String deleteClient(@RequestParam("clientId") Long id) {
        clientService.deleteClientId(id);
        return "redirect:/clients/clientlist";
    }



}
