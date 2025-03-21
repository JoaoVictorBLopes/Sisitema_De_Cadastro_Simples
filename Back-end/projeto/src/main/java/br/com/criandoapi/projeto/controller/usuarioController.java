package br.com.criandoapi.projeto.controller;
import br.com.criandoapi.projeto.DAO.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class usuarioController{

    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public String texto () {
        return "teste";
    }


}
