package com.example.clinica.services;

import com.example.clinica.models.Atendente;
import com.example.clinica.repositories.AtendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtendenteService {

    @Autowired
    private AtendenteRepository atendenteRepository;

    public Atendente save(Atendente atendente){
        return atendenteRepository.save(atendente);

    }


}
