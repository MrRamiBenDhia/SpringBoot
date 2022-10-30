package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.reposotry.ContratRepo;

import java.util.List;

public interface IserviceContrat {

        List<Contrat> retrieveAllContrats();

        Contrat updateContrat (Contrat ce);

        Contrat addContrat (Contrat ce);

        Contrat retrieveContrat (Integer idContrat);

        void removeContrat(Integer idContrat);
}
