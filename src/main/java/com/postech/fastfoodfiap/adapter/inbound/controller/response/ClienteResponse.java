package com.postech.fastfoodfiap.adapter.inbound.controller.response;

import com.postech.fastfoodfiap.application.core.domain.Cliente;

public class ClienteResponse {

    private Long id;
    private String nome;
    private String endereco;
    private String cpf;
    private String email;

    public ClienteResponse(){

    }

    public ClienteResponse(Long id, String nome, String endereco, String cpf, String email){
       this.id = id;
       this.nome = nome;
       this.endereco = endereco;
       this.cpf = cpf;
       this.email = email;
    }

    public static ClienteResponse fromDomain(Cliente cliente){
        return new ClienteResponse(cliente.getId(), cliente.getNome(),cliente.getEndereco(),cliente.getCpf(), cliente.getEmail());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
