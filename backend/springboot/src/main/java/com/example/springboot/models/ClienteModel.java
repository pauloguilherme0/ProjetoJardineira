package com.example.springboot.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_CLIENTE")
public class ClienteModel extends UsuarioModel{

    private static final long serialVersionUID = 1L;

    private Boolean aceitaNotificaoes;
    private Boolean autenticacaoGoogle;

    public Boolean getAceitaNotificaoes() {
        return aceitaNotificaoes;
    }

    public void setAceitaNotificaoes(Boolean aceitaNotificaoes) {
        this.aceitaNotificaoes = aceitaNotificaoes;
    }

    public Boolean getAutenticacaoGoogle() {
        return autenticacaoGoogle;
    }

    public void setAutenticacaoGoogle(Boolean autenticacaoGoogle) {
        this.autenticacaoGoogle = autenticacaoGoogle;
    }
}
