package com.example.springboot.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_VIAGEM")
public class ViagemModel extends RepresentationModel<ProductModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String percurso;
    private Date horarioPartida;
    private Date previsaoChegada;
    private Date dataViagem;
    private Integer numViagem;

    @ManyToMany(mappedBy = "viagemModelList", cascade = CascadeType.ALL)
    private List<RelatorioModel> relatorioModel;

    @OneToOne
    @JoinColumn(name = "id_van")
    private VanModel vanModel;

    @OneToOne
    @JoinColumn(name = "id_onibus")
    private OnibusModel onibusModel;

    @OneToOne
    @JoinColumn(name = "id_motorista")
    private MotoristaModel motoristaModel;

    @OneToOne
    @JoinColumn(name = "id_sistema_embarcado")
    private SistemaEmbarcadoModel sistemaEmbarcadoModel;

    @ManyToOne
    @JoinColumn(name = "id_ocorrencia_especial")
    private OcorrenciaEspecialModel ocorrenciaEspecialModel;

}
