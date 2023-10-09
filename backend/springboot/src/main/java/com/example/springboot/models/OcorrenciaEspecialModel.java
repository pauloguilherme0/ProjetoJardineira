package com.example.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_OCORRENCIAESPECIAL")
public class OcorrenciaEspecialModel extends RepresentationModel<ProductModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Date data;
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "id_administrador_model")
    private AdministradorModel administradorModel;

    @OneToMany(mappedBy = "ocorrenciaEspecialModel", cascade = CascadeType.ALL)
    private List<ViagemModel> viagemModelList;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public AdministradorModel getAdministradorModel() {
        return administradorModel;
    }

    public void setAdministradorModel(AdministradorModel administradorModel) {
        this.administradorModel = administradorModel;
    }

}
