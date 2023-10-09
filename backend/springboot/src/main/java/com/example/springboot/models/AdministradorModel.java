package com.example.springboot.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_ADMINISTRADOR")
public class AdministradorModel extends UsuarioModel{

    private static final long serialVersionUID = 1L;

    private String setor;

    @OneToMany(mappedBy = "administradorModel", cascade = CascadeType.ALL)
    private List<RelatorioModel> relatorioModelList;

    @OneToMany(mappedBy = "administradorModel", cascade = CascadeType.ALL)
    private List<OcorrenciaEspecialModel> ocorrenciaEspecialModelList;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public List<RelatorioModel> getRelatorioModelList() {
        return relatorioModelList;
    }

    public void setRelatorioModelList(List<RelatorioModel> relatorioModelList) {
        this.relatorioModelList = relatorioModelList;
    }



}
