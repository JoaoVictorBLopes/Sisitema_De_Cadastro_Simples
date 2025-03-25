package br.com.criandoapi.projeto.repository;

import br.com.criandoapi.projeto.model.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<usuario, Integer> {
}
