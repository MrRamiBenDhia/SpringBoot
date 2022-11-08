package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Etudiant;

import java.util.List;

public interface IserviceEtudiant {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void assignEtudiantToDepartement(Integer etudiantId, Integer departementId);


    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);
    Etudiant addEtudiantToEquipeAndContract(Integer idE, Integer idContrat, Integer idEquipe);



    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);


    void removeEtudiant(Integer idEtudiant);
}
