package com.example.demo.controllers;

import com.example.demo.models.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PessoaController {

    @GetMapping ("/pessoas")
    public List<Pessoa> pessoa() {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Hugo", 1, "hugo@a.com"));
        pessoas.add(new Pessoa("Matheus", 2, "Matheus@a.com"));
        pessoas.add(new Pessoa("Joaquim", 3, "Joaguim@a.com"));
        pessoas.add(new Pessoa("Marcelo", 4, "Marcelo@a.com"));
        pessoas.add(new Pessoa("Alex", 5, "Alex@a.com"));

        return pessoas;

    }


}
