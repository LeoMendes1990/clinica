package com.example.clinica.services;

import com.example.clinica.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;
}
