package com.example.clinica.services;

import com.example.clinica.models.Medico;
import com.example.clinica.repositories.MedicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico findById(Integer id){
        return medicoRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Medico Não Encontrado!!"));
    }

    public Medico save( Medico medico){
        return medicoRepository.save(medico);
    }
}
