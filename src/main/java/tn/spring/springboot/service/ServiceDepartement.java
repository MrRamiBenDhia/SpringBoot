package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.reposotry.DepartementRepo;

import java.util.List;

@Service
public class ServiceDepartement implements IserviceDepartement{

    @Autowired
    DepartementRepo dr;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return dr.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return dr.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return dr.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return dr.findById(idDepart).get();
    }
}
