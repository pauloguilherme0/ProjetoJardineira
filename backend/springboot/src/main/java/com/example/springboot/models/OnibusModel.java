package com.example.springboot.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ONIBUS")
public class OnibusModel extends VeiculoModel{

    private static final long serialVersionUID = 1L;

    private String placa;
    private Integer capacidade;

    @OneToOne
    @JoinColumn(name = "id_sistema_embarcado")
    private SistemaEmbarcadoModel sistemaEmbarcadoModel;

    @OneToOne(mappedBy = "onibusModel", cascade = CascadeType.ALL)
    private ViagemModel viagemModel;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public SistemaEmbarcadoModel getSistemaEmbarcadoModel() {
        return sistemaEmbarcadoModel;
    }

    public void setSistemaEmbarcadoModel(SistemaEmbarcadoModel sistemaEmbarcadoModel) {
        this.sistemaEmbarcadoModel = sistemaEmbarcadoModel;
    }
}
