package it.uniroma3.siw.film.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.siw.film.model.Attore;

@Repository
public interface AttoreRepository extends CrudRepository<Attore, Long> {
    
}