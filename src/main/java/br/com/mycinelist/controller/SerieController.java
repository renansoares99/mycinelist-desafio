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
import br.com.mycinelist.model.Serie;

/* Repository */
import br.com.mycinelist.repository.SerieRepository;

@RestController
@RequestMapping("/serie")
@CrossOrigin("*")
public class SerieController {

    @Autowired
    private SerieRepository serieRepository;

    /* Read All */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Serie> getAllSerie() {
        return serieRepository.findAll();
    }

    /* Create */
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Serie salvarSerie(@RequestBody Serie serie) {
        serie.setData(LocalDateTime.now());
        return serieRepository.save(serie);
    }

    /* Read ID */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Serie getSerieById(@PathVariable Long id) {
        return serieRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Série Não Encontrada."));
    }

    /* Delete */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteSerie(@PathVariable Long id) {
        var deleteSerie = serieRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Série Não Encontrada."));
        serieRepository.delete(deleteSerie);
        return "Deletedo Com Sucesso!";
    }

    /* Updade */
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String updateSerie(@PathVariable Long id, @RequestBody Serie serie) {
        var updateSerie = serieRepository.findById(id);
        if (updateSerie.isPresent()) {
            var serieSave = updateSerie.get();
            serieSave.setNome(serie.getNome());
            serieSave.setEpisodio(serie.getEpisodio());
            serieSave.setClassifique(serie.getClassifique());
            serieSave.setAvalie(serie.getAvalie());
            serieRepository.save(serieSave);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Série Não Encontrado.");
        }
        return "Editado Com Sucesso!";
    }
}
