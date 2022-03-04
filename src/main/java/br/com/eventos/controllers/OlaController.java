package br.com.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classe responsavél pelo controle das requisições
 * Saber o que fazer em cada URL
 * E chamar a página HTML responsável
 * */

// Anotações -> Tipo da Classe
@Controller
public class OlaController {

//    Anotação -> Tipo de acesso ao metodo
    @GetMapping("/pagina/ola")
    public String olaMundo(){
        // Retornar uma string - NOME DA PAGINA HTML
        return "ola";
    }

    @GetMapping("/dados")
    public ModelAndView paginaComDados(){
        String nome = "JOSE";
        int idade = 50;
        String sexo = "M";


        ModelAndView mv = new ModelAndView("dados");
        mv.addObject("nome", nome);
        mv.addObject("idade", idade);
        mv.addObject("sexo", sexo);

//        String nome = "Anderson";

        return mv;
    }

    @GetMapping("/flamengo")
    public String flamengo(){
        return "flamengo";
    }
}
