package br.com.criandoapi.projeto.controller;
import br.com.criandoapi.projeto.repository.IUsuario;
import br.com.criandoapi.projeto.model.usuario;
import br.com.criandoapi.projeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")

public class usuarioController{

    private UsuarioService usuarioService;

    public usuarioController (UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<usuario>> listaUsuarios () {
        return ResponseEntity.status(200).body(usuarioService.ListarUsuario());
    }

    @PostMapping
    public ResponseEntity<usuario> criarUsuario (@RequestBody usuario usuario) {
       return ResponseEntity.status(201).body(usuarioService.criarUsuario(usuario));
    }

    @PutMapping
    public ResponseEntity<usuario> editarUsuario (@RequestBody usuario usuario) {
        return ResponseEntity.status(200).body(usuarioService.editarUsuario(usuario));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirUsuario (@PathVariable int id) {
        usuarioService.deletarUsuario(id);
        return ResponseEntity.status(204).build();
    }
}
