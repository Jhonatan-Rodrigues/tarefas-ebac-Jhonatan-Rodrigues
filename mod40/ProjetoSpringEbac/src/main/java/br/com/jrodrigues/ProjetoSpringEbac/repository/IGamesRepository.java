package br.com.jrodrigues.ProjetoSpringEbac.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jrodrigues.ProjetoSpringEbac.domain.Games;

@Repository
public interface IGamesRepository extends CrudRepository<Games, Long> {

}
