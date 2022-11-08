package tn.spring.springboot.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdContrat")
    int IdContrat;
    @Temporal (TemporalType.DATE)
    Date dateDebutContrat;
    @Temporal (TemporalType.DATE)
    Date dateFinContrat;
    @Enumerated(EnumType.STRING)
     Specialite Specialite;
    boolean Archive;
    int montantContrat;
    @ManyToOne
    @JsonIgnore

    private Etudiant etudiant;
}
