package br.com.marcosalexandre.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/ -------
public class MinhaPrimeiraControler {

    /**
     * Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - adicionar um dado/informação
     * PUT - alterar um dado/info
     * DELETE - remover um dado 
     * PATCH - alterar somente uma parte da info/dado
     * 
     */

     // Método (funcionalidade) de uma classe
     @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }
}
