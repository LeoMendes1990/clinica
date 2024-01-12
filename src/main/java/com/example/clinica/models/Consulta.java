package com.example.clinica.models;

import com.example.clinica.enums.Especialidade;
import com.example.clinica.enums.StatusConsulta;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Atendente atendente;
    @OneToOne
    private Medico medico;
    @OneToOne
    private Paciente paciente;

    @JsonFormat(pattern = "HH:mm - dd/MM/yyyy")
    private LocalDateTime data_Atendimento;

    private StatusConsulta statusConsulta;


    public Consulta() {
    }

    public Consulta(Integer id, Atendente atendente, Medico medico, Paciente paciente, LocalDateTime data_Atendimento, StatusConsulta statusConsulta) {
        this.id = id;
        this.atendente = atendente;
        this.medico = medico;
        this.paciente = paciente;
        this.data_Atendimento = data_Atendimento;
        this.statusConsulta = statusConsulta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public StatusConsulta getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(StatusConsulta statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public LocalDateTime getDateTime() {
        return data_Atendimento;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.data_Atendimento = data_Atendimento;
    }
}
