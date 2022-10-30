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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IdUniversite")
    int IdUniversite;
    String nomUni;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Departement> departements;

}
