package com.adocao.model;

public class Adotante {

private Integer id;
private String nome;
private Integer cpf;
private Integer telefone;
private String email;
private String endereco;
private Pet petsAdotados;

public Adotante(){
    
}

    public Adotante(Integer cpf, String email, String endereco, Integer id, String nome, Pet petsAdotados, Integer telefone) {
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.id = id;
        this.nome = nome;
        this.petsAdotados = petsAdotados;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Pet getPetsAdotados() {
        return petsAdotados;
    }

    public void setPetsAdotados(Pet petsAdotados) {
        this.petsAdotados = petsAdotados;
    }



}
