package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pessoa {

    private String nome;
    private int idade;
   // private String email;
    private String sobrenome;

    public Pessoa() {}

    public Pessoa(String nome, int idade ) {
        this.nome = nome;
        this.idade = idade;


    }




    public String getSobrenome() {
        return sobrenome;
    }
}
