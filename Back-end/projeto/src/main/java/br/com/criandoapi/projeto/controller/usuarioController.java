package br.com.criandoapi.projeto.controller;
import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class usuarioController{

    @Autowired
    private IUsuario dao;

    @GetMapping("/usuarios")
    public List<usuario> listaUsuarios () {
        return (List<usuario>) dao.findAll();
    }

}
