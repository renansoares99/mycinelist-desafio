package br.com.mycinelist.model;

/* Java */
import java.time.LocalDateTime;

/* Lombok */
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/* JPA */
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/* Json */
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int classifique;

    @Lob
    private String avalie;

    @JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime data;
}
