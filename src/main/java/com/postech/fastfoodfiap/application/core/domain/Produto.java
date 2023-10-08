package com.postech.fastfoodfiap.application.core.domain;

import java.util.UUID;

public class Produto {

    private UUID codigo;
    private String nome;
    private String descricao;
    private String imagem;
    private Double preco;
    private Categoria categoria;

    public Produto(){}

    public Produto(UUID codigo, String nome, String descricao, String imagem, Double preco, Categoria categoria){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setImagem(imagem);
        this.setPreco(preco);
        this.setCategoria(categoria);
    }

    public enum Categoria{
        LANCHE,
        ACOMPANHAMENTO,
        BEBIDA,
        SOBREMESA
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
