package com.example.clinica.dtos;

public class AtendenteDTO {

    private Integer id;
    private String nome;
    private  Integer matricula;

    public AtendenteDTO() {
    }

    public AtendenteDTO(Integer id, String nome, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
}
