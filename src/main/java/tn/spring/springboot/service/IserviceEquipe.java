package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Equipe;

import java.util.List;

public interface IserviceEquipe {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

    void removeEquipe(int id);
}
