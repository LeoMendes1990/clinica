package com.example.clinica.controller;

import com.example.clinica.models.Paciente;
import com.example.clinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;
//Buscar
    @GetMapping(value = "/{id}")
    public Paciente findById(@PathVariable Integer id){
        return pacienteService.findById(id);
    }
//Salvar
    @PostMapping
    public Paciente save(@RequestBody Paciente paciente){
        return pacienteService.save(paciente);
    }
}
