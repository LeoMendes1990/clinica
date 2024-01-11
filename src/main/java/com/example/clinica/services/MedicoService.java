package com.example.clinica.services;

import com.example.clinica.models.Medico;
import com.example.clinica.repositories.MedicoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> findAll(){
        return medicoRepository.findAll();
    }

    public Medico findById(Integer id){
        return medicoRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Medico Não Encontrado!!"));
    }

    public Medico save( Medico medico){
        return medicoRepository.save(medico);
    }

    public Medico update(Medico medico, Integer id){
        medico.setId(id);
        return medicoRepository.save(medico);
    }
    public void delete(Integer id){
        medicoRepository.deleteById(id);
    }
}

