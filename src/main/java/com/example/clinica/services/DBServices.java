package com.example.clinica.services;

import com.example.clinica.models.Atendente;
import com.example.clinica.models.Consulta;
import com.example.clinica.models.Medico;
import com.example.clinica.models.Paciente;
import org.springframework.stereotype.Service;

@Service
public class DBServices {

    public void instaciaDB(){

       //

        Atendente at1 = new Atendente(null,"Leo",123);
        Medico med1 = new Medico(null,"Roberto","123456");
        Paciente pac1 = new Paciente(null,"Lais",22);

        Consulta consulta = new Consulta(null, at1,med1,pac1);


    }
}
