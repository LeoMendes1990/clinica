package com.example.clinica.services;

import com.example.clinica.models.Paciente;
import com.example.clinica.repositories.PacienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;
    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    public Paciente findById(Integer id){
        return pacienteRepository.findById(id).orElseThrow(()->new EntityNotFoundException("Paciente Não Encontrado!!"));
    }

    public Paciente save( Paciente paciente){
        return pacienteRepository.save(paciente);
    }
    public Paciente update(Paciente paciente, Integer id){
        paciente.setId(id);
        return pacienteRepository.save(paciente);
    }
    public void delete( Integer id){
        pacienteRepository.deleteById(id);
    }
}
