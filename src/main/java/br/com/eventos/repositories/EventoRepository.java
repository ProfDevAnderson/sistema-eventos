package br.com.eventos.repositories;

import br.com.eventos.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface que vai acessar o banco de dados através
// do JPA - Através da Herança
@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
