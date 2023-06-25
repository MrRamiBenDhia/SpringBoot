package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Etudiant;

@Repository

public interface EtudiantRepo extends JpaRepository<Etudiant, Integer> {
    @Query("SELECT e FROM Etudiant e WHERE e.Prenom =:prenomEt  and e.nomE=: nomEt ")
    Etudiant getEtudiantByNomPrenom(@Param("nom") String nomEt,@Param("prenom")String prenomEt);




@Query("SELECT e FROM Etudiant e WHERE e.Prenom =:prenomEt  and e.nomE=: nomEt ")
    Etudiant getEtudiantsByDepartement(@Param("nom") String nomEt,@Param("prenom")String prenomEt);



}