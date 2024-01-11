package com.example.clinica.services;

import com.example.clinica.enums.Especialidade;
import com.example.clinica.enums.StatusConsulta;
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

import java.time.LocalDateTime;

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
   // @Autowired
 //   private StatusConsulta statusConsulta;


    public void instanciaDB() {

        //

        Atendente at1 = new Atendente(null, "Leonardo Mendes", 123);
        Atendente at2 = new Atendente(null, "Joao Pedro", 456);
        Atendente at3 = new Atendente(null, "Thiago Silva", 789);
        Medico med1 = new Medico(null, "Roberto Queiroz", "123456", Especialidade.CARDIOLOGISTA);
        Medico med2 = new Medico(null, "David Jose", "456133",Especialidade.CLINICO);
        Medico med3 = new Medico(null, "Lais Mendes", "789445",Especialidade.NEUROLOGISTA);
        Paciente pac1 = new Paciente(null, "Lais", 22);


        Consulta consulta = new Consulta(null, at1, med1, pac1, LocalDateTime.now(), StatusConsulta.EM_ANDAMENTO);




        atendenteRepository.save(at1);
        atendenteRepository.save(at2);
        atendenteRepository.save(at3);
        medicoRepository.save(med1);
        medicoRepository.save(med2);
        medicoRepository.save(med3);
        pacienteRepository.save(pac1);
        consultaRepository.save(consulta);


    }
}
