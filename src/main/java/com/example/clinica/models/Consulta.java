package com.example.clinica.models;

import jakarta.persistence.*;

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


    public Consulta() {
    }

    public Consulta(Integer id, Atendente atendente, Medico medico, Paciente paciente) {
        this.id = id;
        this.atendente = atendente;
        this.medico = medico;
        this.paciente = paciente;
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
}
