package br.com.criandoapi.projeto.controller;
import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")

public class usuarioController{

    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<usuario> listaUsuarios () {
        return (List<usuario>) dao.findAll();
    }

    @PostMapping
    public usuario criarUsuario (@RequestBody usuario usuario) {
       usuario usuarioNovo = dao.save(usuario);
       return usuarioNovo;
    }

    @PutMapping
    public usuario editarUsuario (@RequestBody usuario usuario) {
        usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @DeleteMapping("/{id}")
    public Optional<usuario> excluirUsuario (@PathVariable int id) {
        Optional<usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }



}
