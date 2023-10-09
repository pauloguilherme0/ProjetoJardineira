package com.example.springboot.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_RELATORIO")
public class RelatorioModel extends RepresentationModel<ProductModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Date dataGeracao;

    @ManyToOne
    @JoinColumn(name = "id_administrador_model")
    private AdministradorModel administradorModel;

    @ManyToMany
    @JoinColumn(name = "id_viagem")
    private List<ViagemModel> viagemModelList;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public AdministradorModel getAdministradorModel() {
        return administradorModel;
    }

    public void setAdministradorModel(AdministradorModel administradorModel) {
        this.administradorModel = administradorModel;
    }

}
