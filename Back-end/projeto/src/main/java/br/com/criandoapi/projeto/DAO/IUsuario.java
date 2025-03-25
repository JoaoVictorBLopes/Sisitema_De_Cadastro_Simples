package br.com.criandoapi.projeto.DAO;

import br.com.criandoapi.projeto.model.usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<usuario, Integer> {
}
