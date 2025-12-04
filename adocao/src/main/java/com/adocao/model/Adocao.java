package com.adocao.model;

import java.text.DateFormat;

public class Adocao {

private Integer id;
private Pet petId;
private Adotante adotanteId;
private DateFormat dataAdocao;
private String observacoes;

public Adocao(){

}

    public Adocao(Adotante adotanteId, DateFormat dataAdocao, Integer id, String observacoes, Pet petId) {
        this.adotanteId = adotanteId;
        this.dataAdocao = dataAdocao;
        this.id = id;
        this.observacoes = observacoes;
        this.petId = petId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pet getPetId() {
        return petId;
    }

    public void setPetId(Pet petId) {
        this.petId = petId;
    }

    public Adotante getAdotanteId() {
        return adotanteId;
    }

    public void setAdotanteId(Adotante adotanteId) {
        this.adotanteId = adotanteId;
    }

    public DateFormat getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(DateFormat dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    }
