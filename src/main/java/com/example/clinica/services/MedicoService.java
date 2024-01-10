package com.example.clinica.services;

import com.example.clinica.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;
}
