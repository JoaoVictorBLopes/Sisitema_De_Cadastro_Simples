package br.com.criandoapi.projeto.service;

import br.com.criandoapi.projeto.model.usuario;
import br.com.criandoapi.projeto.repository.IUsuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private IUsuario repository;
    private PasswordEncoder PasswordEncoder;

    public UsuarioService (IUsuario repository) {
        this.repository = repository;
        this.PasswordEncoder = new BCryptPasswordEncoder();
    }

    public List<usuario> ListarUsuario () {
        List<usuario> lista = repository.findAll();
        return lista;
    }

    public usuario criarUsuario(usuario usuario) {
        String encoder = this.PasswordEncoder.encode(usuario.getSenha());
        usuario.setSenha(encoder);
        usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public usuario editarUsuario(usuario usuario) {
        String encoder = this.PasswordEncoder.encode(usuario.getSenha());
        usuario.setSenha(encoder);
        usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public Boolean deletarUsuario(int id) {
        repository.deleteById(id);
        return true;
    }

    public Boolean validarSenha(usuario usuario) {
        String senha = repository.getById(usuario.getId()).getSenha();
        boolean valid = PasswordEncoder.matches(usuario.getSenha(), senha);
        return valid;
    }
}
