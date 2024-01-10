package com.example.clinica.controller;

import com.example.clinica.models.Atendente;
import com.example.clinica.services.AtendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atendente")
public class AtendenteController {
    @Autowired
    private AtendenteService atendenteService;

    @PostMapping
    public Atendente save(@RequestBody Atendente atendente){
        return atendenteService.save(atendente);
    }

  
}
