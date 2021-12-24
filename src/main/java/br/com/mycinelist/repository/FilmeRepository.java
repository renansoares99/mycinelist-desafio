package br.com.mycinelist.repository;

/* JPA */
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/* Model */
import br.com.mycinelist.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {}
