package com.example.clinica.services;

import com.example.clinica.models.Consulta;
import com.example.clinica.repositories.ConsultaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public List<Consulta> findAll(){
        return consultaRepository.findAll();
    }

    public Consulta findById(Integer id) {           // duvidas or.ElseThrow
        return consultaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Consulta Não Encontrada!!"));
    }

    public Consulta save(Consulta consulta) {
        return consultaRepository.save(consulta);
    }
    public Consulta update(Consulta consulta,Integer id){
        consulta.setId(id);
        return consultaRepository.save(consulta);
    }
    public void delete(Integer id){
        consultaRepository.deleteById(id);
    }

}
