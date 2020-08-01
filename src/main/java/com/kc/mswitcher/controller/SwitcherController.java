package com.kc.mswitcher.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SwitcherController {

    @PostMapping("/group/{name}")
    public String addGroup(@PathVariable String name) {
    	return null;
    }

    
    
}
