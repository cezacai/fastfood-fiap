package com.postech.fastfoodfiap.adapter.inbound.controller.request;

import com.postech.fastfoodfiap.application.core.domain.Cliente;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class ClienteRequest {

    @NotNull(message = "Nome obrigatório")
    private String nome;

    @NotNull(message = "Endereço obrigatório")
    private String endereco;

    @CPF(message = "CPF inválido")
    @NotNull(message = "CPF obrigatório")
    private String cpf;

    @Email(message = "E-mail inválido")
    @NotNull(message = "Email obrigatório")
    private String email;

    public Cliente toDomain(){
        return new Cliente(nome, endereco, cpf, email);
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
