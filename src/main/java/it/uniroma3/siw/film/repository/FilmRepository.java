package it.uniroma3.siw.film.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.siw.film.model.Film;

@Repository
public interface FilmRepository  extends CrudRepository<Film, Long>{

    public boolean existsByNomeAndAnno(String nome, Short anno);

    @Query(
  value = "select * from film f order by f.anno desc limit 5", 
  nativeQuery = true)
    public List<Film> findAllTop5OrderByAnno();
}
