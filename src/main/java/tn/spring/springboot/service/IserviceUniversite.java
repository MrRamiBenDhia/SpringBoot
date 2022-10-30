package tn.spring.springboot.service;

import tn.spring.springboot.Entity.Universite;

import java.util.List;

public interface IserviceUniversite {
    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (Integer idUniversite);
}
