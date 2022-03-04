package br.com.eventos.controllers;

import br.com.eventos.models.Evento;
import br.com.eventos.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EventoController {

    @Autowired
    EventoRepository  eventoRepository;

    @GetMapping("")
    public String index(){
        return "evento/index";
    }

    @GetMapping("/todos/eventos")
    public ModelAndView verTodosEventos(){
//         lISTA DE EVENTOS
        List<Evento> listaEventos = new ArrayList<>();

        listaEventos = eventoRepository.findAll();

        ModelAndView mv = new ModelAndView("evento/eventos");
        mv.addObject("listaEventos", listaEventos );

        return mv;
    }


//    @GetMapping("/todos/eventos")
//    public ModelAndView verTodosEventos(){
////         lISTA DE EVENTOS
//        List<Evento> listaEventos = new ArrayList<>();
//
//        Evento e1 = new Evento(1L, "Festa no Apê",
//                "Vai rolar uma festa no Apê", "Agendada");
//        Evento e2 = new Evento(2L, "Festa do Pijama",
//                "Vai rolar uma festa de Pijama", "Cancelada");
//        Evento e3 = new Evento(3L, "Aniversário IFMA",
//                "Venha festejar", "Confirmada");
//        Evento e4 = new Evento(4L, "Festa Mundial Palmeiras",
//                "Aguardando o Palmeiras ganhar o mundial", "Aguardando");
//
//        listaEventos.add(e1);
//        listaEventos.add(e2);
//        listaEventos.add(e3);
//        listaEventos.add(e4);
//
//        ModelAndView mv = new ModelAndView("evento/eventos");
//        mv.addObject("listaEventos", listaEventos );
//
//        return mv;
//    }
}
