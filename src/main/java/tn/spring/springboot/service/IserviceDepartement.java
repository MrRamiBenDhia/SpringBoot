package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Departement;

import java.util.List;

public interface IserviceDepartement {
    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);

    void removeDepartement(Integer idEtudiant);
}
