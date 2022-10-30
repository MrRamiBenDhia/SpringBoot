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
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdEtudiant")
    long IdEtudiant;
    String Prenom;
    String nomE;
    @Enumerated(EnumType.STRING)
     Domaine Domaine;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "etudiant")
    private Set< Contrat > Contrats;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set< Equipe > equipes;
    @ManyToOne
    private Departement departement;






}
