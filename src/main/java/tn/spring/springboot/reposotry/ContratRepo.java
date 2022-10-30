package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Contrat;

@Repository
public interface ContratRepo extends JpaRepository<Contrat,Integer> {

}
