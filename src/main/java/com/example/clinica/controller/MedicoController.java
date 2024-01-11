package com.example.clinica.controller;

import com.example.clinica.models.Medico;
import com.example.clinica.services.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;
    @GetMapping
    public List<Medico> findAll(){
        return medicoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Medico findById(@PathVariable Integer id) {
        return medicoService.findById(id);
    }

    @PostMapping
    public Medico save(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }
    @PutMapping(value = "/{id}")
    public Medico update(@RequestBody Medico medico, @PathVariable Integer id){
        return medicoService.update(medico,id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        medicoService.delete(id);
    }
}
