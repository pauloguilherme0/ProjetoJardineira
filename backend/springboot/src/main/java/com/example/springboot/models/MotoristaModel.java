package com.example.springboot.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_MOTORISTA")
public class MotoristaModel extends UsuarioModel{

    private static final long serialVersionUID = 1L;

    private String cnh;

    @OneToOne(mappedBy = "motoristaModel", cascade = CascadeType.ALL)
    private ViagemModel viagemModel;

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
