package com.postech.fastfoodfiap.application.core.domain;

public class Cliente {

    private Long id;
    private String nome;
    private String endereco;
    private String cpf;
    private String email;

    public Cliente(){
    }

    public Cliente(String nome, String endereco, String cpf, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
