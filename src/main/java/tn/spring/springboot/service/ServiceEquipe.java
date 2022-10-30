package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.reposotry.EquipeRepo;

import java.util.List;

@Service
public class ServiceEquipe implements IserviceEquipe{
    @Autowired
    EquipeRepo er;

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return er.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return er.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return er.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return er.findById(idEquipe).get();
    }
}
