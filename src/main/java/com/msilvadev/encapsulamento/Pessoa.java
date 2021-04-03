package com.msilvadev.encapsulamento;

/**
 * Encapsular é esconder como eu faço as coisas
 */
public class Pessoa {
    private String nome;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
