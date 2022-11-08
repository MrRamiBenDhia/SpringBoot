package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Universite;

import java.util.Date;
import java.util.List;

public interface IserviceUniversite {
    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Integer idUniversite);
    void assignDepartementtoUniversity(Integer idDepartement, Integer idUniversite);


    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
}
