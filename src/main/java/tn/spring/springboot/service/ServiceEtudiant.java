package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.reposotry.EtudiantRepo;

import java.util.List;

@Service
public class ServiceEtudiant implements IserviceEtudiant{

    @Autowired
    EtudiantRepo er;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return er.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return er.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return er.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
er.deleteById(idEtudiant);
    }
}
