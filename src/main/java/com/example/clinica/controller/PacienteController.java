package com.example.clinica.controller;

import com.example.clinica.models.Paciente;
import com.example.clinica.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;
    @GetMapping
    public List<Paciente> findAll(){
        return pacienteService.findAll();
    }
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
    @PutMapping(value = "/{id}")
    public Paciente update(@RequestBody Paciente paciente, @PathVariable Integer id){
        return pacienteService.update(paciente,id);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id){
        pacienteService.delete(id);
    }
}
