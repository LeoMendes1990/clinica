package com.example.clinica.enums;

public enum Especialidade {

    // duvidas...

    ORTOPEDISTA(0),
    CARDIOLOGISTA(1),
    NEUROLOGISTA(2),
    CLINICO(3),
    DERMATOLOGISTA(4);
private Integer codigo;

    Especialidade(Integer codigo) {
        this.codigo = codigo;
    }
}
