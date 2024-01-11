package com.example.clinica.services;

import com.example.clinica.models.Consulta;
import com.example.clinica.repositories.ConsultaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
    @Autowired
   private  ConsultaRepository consultaRepository;

    public Consulta save( Consulta consulta){
        return consultaRepository.save(consulta);
    }
    public Consulta findById(Integer id){           // duvidas or.ElseThrow
        return consultaRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Consulta Não Encontrada!!"));
    }
}
