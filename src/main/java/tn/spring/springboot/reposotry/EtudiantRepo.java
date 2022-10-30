package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Etudiant;

@Repository

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {


}