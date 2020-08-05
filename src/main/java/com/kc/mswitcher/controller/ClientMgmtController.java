package com.kc.mswitcher.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kc.mswitcher.model.Client;


@RestController
public class ClientMgmtController {

	@PostMapping("/cmg/create")
    public String createClient(@RequestBody Client clientRequest) {
    	return null;
    }

	@PutMapping("/cmg/update")
    public String updateClient(@RequestBody Client clientRequest) {
    	return null;
    }
	
	@GetMapping("/cmg/list")
    public List<Client> listClients() {
    	return null;
    }
	
	
}
