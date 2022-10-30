package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.reposotry.ContratRepo;

import java.util.List;

@Service
public class ServiceContrat implements IserviceContrat{
@Autowired
    ContratRepo cr;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return cr.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return cr.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return cr.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return cr.findById(idContrat).get();
    }

    @Override
    public void removeContrat(Integer idContrat) {
cr.deleteById(idContrat);
    }
}

