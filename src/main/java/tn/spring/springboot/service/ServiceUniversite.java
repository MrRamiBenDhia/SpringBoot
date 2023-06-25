package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Entity.Universite;
import tn.spring.springboot.reposotry.DepartementRepo;
import tn.spring.springboot.reposotry.UniversiteRepo;

import java.util.List;

@Service
public class ServiceUniversite implements IserviceUniversite{
    @Autowired
    DepartementRepo dr;
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

    @Override
    public void assignDepartementtoUniversity(Integer idDepartement, Integer idUniversite) {

        Universite U = ur.findById(idUniversite).get();
        Departement D = dr.findById(idDepartement).get();
                U.getDepartements().add(D);
                ur.save(U);
    }

}
