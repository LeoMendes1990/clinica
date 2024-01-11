package com.example.clinica.controller;

import com.example.clinica.models.Consulta;
import com.example.clinica.repositories.ConsultaRepository;
import com.example.clinica.services.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<Consulta> findAll() {
        return consultaService.findAll();
    }

    @GetMapping(value = "/{id}")

    public Consulta findById(@PathVariable Integer id) {
        return consultaService.findById(id);
    }

    @PostMapping

    // duvidas RequestBody
    public Consulta save(@RequestBody Consulta consulta) {
        return consultaService.save(consulta);
    }

    @PutMapping(value = "/{id}")

    public Consulta update(@RequestBody Consulta consulta, @PathVariable Integer id) {

        return consultaService.update(consulta, id);
    }

    @DeleteMapping(value = "/{id}")

    public void delete(@PathVariable Integer id) {
        consultaService.delete(id);
    }
}
