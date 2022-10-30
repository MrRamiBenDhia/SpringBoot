package tn.spring.springboot.Entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdEquipe")
    int IdEquipe;
    String nomEquipe;
    @Enumerated(EnumType.STRING)
     Niveau niveau;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "equipes")
    private Set<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;
}
