package br.com.criandoapi.projeto.service;

import br.com.criandoapi.projeto.model.usuario;
import br.com.criandoapi.projeto.repository.IUsuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private IUsuario repository;
    public UsuarioService (IUsuario repository) {
        this.repository = repository;
    }

    public List<usuario> ListarUsuario () {
        List<usuario> lista = repository.findAll();
        return lista;
    }

    public usuario criarUsuario(usuario usuario) {
        usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }


}
