package it.uniroma3.siw.film.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.siw.film.model.Regista;

@Repository
public interface RegistaRepository extends CrudRepository<Regista, Long>{

}
