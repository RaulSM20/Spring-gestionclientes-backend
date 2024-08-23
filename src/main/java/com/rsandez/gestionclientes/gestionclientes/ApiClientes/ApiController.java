package com.rsandez.gestionclientes.gestionclientes.ApiClientes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ApiController {

    @PostMapping(value = "apiClientes")
    public String welcome() {
        
        return "Welcome from secure endpoint";
    }
    
}
