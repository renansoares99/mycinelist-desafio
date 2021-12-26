package br.com.mycinelist.repository;

/* JPA */
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/* Model */
import br.com.mycinelist.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {}
