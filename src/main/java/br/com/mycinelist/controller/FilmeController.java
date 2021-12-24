package br.com.mycinelist.controller;

/* JPA */
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;

/* Java */
import java.util.List;
import java.time.LocalDateTime;

/* Modal */
import br.com.mycinelist.model.Filme;

/* Repository */
import br.com.mycinelist.repository.FilmeRepository;

@RestController
@RequestMapping("/filme")
@CrossOrigin("*")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    /* Read All */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Filme> getAllFilme() {
        return filmeRepository.findAll();
    }

    /* Create */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Filme salvarFilme(@RequestBody Filme filme) {
        filme.setData(LocalDateTime.now());
        return filmeRepository.save(filme);
    }

    /* Read ID */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Filme getFilmeById(@PathVariable Long id) {
        return filmeRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Filme Não Encontrado."));
    }

    /* Delete */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteFilme(@PathVariable Long id) {
        var deleteFilme = filmeRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Filme Não Encontrado"));
        filmeRepository.delete(deleteFilme);
        return "Deletado Com Sucesso!";
    }

    /* Updade */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String updateFilme(@PathVariable Long id, @RequestBody Filme filme) {
        var updateFilme = filmeRepository.findById(id);
        if(updateFilme.isPresent()) {
            var filmeSave = updateFilme.get();
            filmeSave.setNome(filme.getNome());
            filmeSave.setVotacao(filme.getVotacao());
            filmeSave.setComentario(filme.getComentario());
            filmeRepository.save(filmeSave);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Filme Não Encontrado");
        }
        return "Editado Com Sucesso!";
    }
}
