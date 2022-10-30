package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Entity.Universite;
import tn.spring.springboot.reposotry.UniversiteRepo;

import java.util.List;

@Service
public class ServiceUniversite implements IserviceUniversite{
    @Autowired
    UniversiteRepo ur;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return ur.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return ur.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return ur.findById(idUniversite).get();
    }
}
