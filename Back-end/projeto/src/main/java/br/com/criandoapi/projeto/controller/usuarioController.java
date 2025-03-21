package br.com.criandoapi.projeto.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class usuarioController {

    @GetMapping("/usuarios")
    public String texto () {
        return "Acessando a api";
    }


}
