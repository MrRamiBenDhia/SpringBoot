package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Entity.Universite;

@Repository
public interface UniversiteRepo extends JpaRepository<Universite, Integer> {
}
