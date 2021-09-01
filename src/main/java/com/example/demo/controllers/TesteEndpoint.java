package com.example.demo.controllers;

import com.example.demo.models.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

    @RestController
    public class TesteEndpoint {


    //
    //    @GetMapping ("/pessoas")
    //    public List<Pessoa> pessoa() {
    //
    //        List<Pessoa> pessoas = new ArrayList<>();
    //
    //        pessoas.add(new Pessoa("Hugo", 15, "hugo@a.com"));
    //        pessoas.add(new Pessoa("Matheus", 25, "Matheus@a.com"));
    //        pessoas.add(new Pessoa("Joaquim", 35, "Joaguim@a.com"));
    //        pessoas.add(new Pessoa("Marcelo", 45, "Marcelo@a.com"));
    //        pessoas.add(new Pessoa("Alex", 55, "Alex@a.com"));
    //
    //        return pessoas;
    //
    //    }


        @GetMapping("/pessoa1")
        public Pessoa retornaPessoa(@RequestParam String nome, @RequestParam String sobrenome, @RequestParam int idade) {
            Pessoa pessoa = new Pessoa();

            pessoa.setNome(nome);
            pessoa.setSobrenome(sobrenome);
            pessoa.setIdade(idade);

            return pessoa;

        }

        @GetMapping("/{nome}/{sobrenome}")
        public String nomePessoa(@PathVariable String nome, @PathVariable String sobrenome){
            return "meu nome é " + nome + " " + sobrenome;
        }

        @GetMapping("/inicial")
        public String nomePessoa2(@RequestParam String nome, @RequestParam String sobrenome) {
            return nome + " " + sobrenome;

        }

        @GetMapping("/numero")
        public Integer testeComNumero(@RequestParam Integer numero) {
            return numero;
        }



    }
