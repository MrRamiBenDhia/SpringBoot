package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Etudiant;

import java.util.List;

public interface IserviceEtudiant {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
}
