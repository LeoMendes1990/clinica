package com.example.clinica.services;

import com.example.clinica.models.Atendente;
import com.example.clinica.models.Consulta;
import com.example.clinica.models.Medico;
import com.example.clinica.models.Paciente;
import com.example.clinica.repositories.AtendenteRepository;
import com.example.clinica.repositories.ConsultaRepository;
import com.example.clinica.repositories.MedicoRepository;
import com.example.clinica.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBServices {
    @Autowired
    private AtendenteRepository atendenteRepository;
    @Autowired
    private MedicoRepository medicoRepository;
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private ConsultaRepository consultaRepository;

    public void instanciaDB() {

        //

        Atendente at1 = new Atendente(null, "Leon", 123);
        Atendente at2 = new Atendente(null, "Leon", 123);
        Atendente at3 = new Atendente(null, "Leon", 123);
        Medico med1 = new Medico(null, "Roberto", "123456");
        Paciente pac1 = new Paciente(null, "Lais", 22);

        Consulta consulta = new Consulta(null, at1, med1, pac1);

        atendenteRepository.save(at1);
        atendenteRepository.save(at2);
        atendenteRepository.save(at3);
        medicoRepository.save(med1);
        pacienteRepository.save(pac1);
        consultaRepository.save(consulta);


    }
}
