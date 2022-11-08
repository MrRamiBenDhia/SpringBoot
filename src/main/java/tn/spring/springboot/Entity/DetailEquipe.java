package tn.spring.springboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdDetailEquipe")
    int IdDetailEquipe;
    int salle;
    String thematique;
    @OneToOne(mappedBy = "detailEquipe")
    @JsonIgnore
    private Equipe equipe;
}
