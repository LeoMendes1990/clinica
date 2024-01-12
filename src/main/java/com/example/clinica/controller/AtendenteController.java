package com.example.clinica.controller;

import com.example.clinica.configs.ModelMapperConfig;
import com.example.clinica.dtos.AtendenteDTO;
import com.example.clinica.models.Atendente;
import com.example.clinica.services.AtendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atendente")
public class AtendenteController {
    @Autowired
    private AtendenteService atendenteService;
    @Autowired
    private ModelMapperConfig modelMapper;

    @GetMapping
    public List<Atendente> findall() {
        return atendenteService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<AtendenteDTO> findById(@PathVariable Integer id) {
        Atendente ate = atendenteService.findById(id);
        return ResponseEntity.ok().body(modelMapper.)
    }

    @PostMapping
    public Atendente save(@RequestBody Atendente atendente) {
        return atendenteService.save(atendente);
    }

    @PutMapping(value = "/{id}")
    public Atendente update(@RequestBody Atendente atendente, @PathVariable Integer id) {
        return atendenteService.update(atendente, id);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        atendenteService.delete(id);
    }


}
