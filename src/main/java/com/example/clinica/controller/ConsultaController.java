package com.example.clinica.controller;

import com.example.clinica.models.Consulta;
import com.example.clinica.repositories.ConsultaRepository;
import com.example.clinica.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @PostMapping

    // duvidas RequestBody
    public Consulta save(@RequestBody Consulta consulta) {
        return consultaService.save(consulta);
    }

    @GetMapping(value = "/{id}")

    public Consulta findById(@PathVariable Integer id) {
        return consultaService.findById(id);


    }
}
