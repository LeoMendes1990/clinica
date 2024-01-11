package com.example.clinica.enums;

public enum StatusConsulta {

    AGENDADA(0),
    EM_ANDAMENTO(1),
    ENCERRADA(2);

    private Integer codigo;

    StatusConsulta(Integer codigo) {
        this.codigo = codigo;
    }
}
