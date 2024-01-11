package com.example.clinica.controller;

import com.example.clinica.models.Medico;
import com.example.clinica.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medico")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping(value = "/{id}")
    public Medico findById(@PathVariable Integer id) {
        return medicoService.findById(id);
    }

    @PostMapping
    public Medico save(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }
}
