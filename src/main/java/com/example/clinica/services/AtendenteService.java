package com.example.clinica.services;

import com.example.clinica.models.Atendente;
import com.example.clinica.repositories.AtendenteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AtendenteService {

    @Autowired
    private AtendenteRepository atendenteRepository;

    public List<Atendente> findAll() {
        return atendenteRepository.findAll();
    }

    public Atendente findById(Integer id) {
        return atendenteRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Atendente não Encontrada!!"));
    }

    public Atendente save(Atendente atendente) {
        return atendenteRepository.save(atendente);

    }

    public Atendente update(Atendente atendente, Integer id) {
        atendente.setId(id);
        return atendenteRepository.save(atendente);
    }

    public void delete(Integer id) {
        atendenteRepository.deleteById(id);
    }


}
