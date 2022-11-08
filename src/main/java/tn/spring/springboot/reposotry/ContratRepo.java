package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Contrat;

@Repository
public interface ContratRepo extends JpaRepository<Contrat,Integer> {


//    @Query("SELECT e FROM Etudiant e WHERE e.Prenom =:prenomEt  and e.nomE=: nomEt ")
//    Contrat affectContratToEtudiant (Integer idContrat, String nomEt ,String prenomEt);
}
