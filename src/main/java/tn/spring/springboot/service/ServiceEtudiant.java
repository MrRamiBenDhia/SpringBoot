package tn.spring.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.reposotry.ContratRepo;
import tn.spring.springboot.reposotry.DepartementRepo;
import tn.spring.springboot.reposotry.EquipeRepo;
import tn.spring.springboot.reposotry.EtudiantRepo;

import java.util.List;
import java.util.Set;

@Service
public class ServiceEtudiant implements IserviceEtudiant {

    @Autowired
    ContratRepo cr;
    @Autowired
    EquipeRepo eqr;
    @Autowired
    DepartementRepo dr;
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
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant e = er.findById(etudiantId).get();

        Departement d = dr.findById(departementId).get();
        e.setDepartement(d);
        er.save(e);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {

        //! error to fix !!
        //   Etudiant et = er.findById((int) e.getIdEtudiant()).get();

        Contrat c = cr.findById(idContrat).get();
        Equipe eq = eqr.findById(idEquipe).get();

        c.setEtudiant(e);
        eq.getEtudiants().add(e);

        er.save(e);


//        e.getEquipes().add(eq);
//
//        e.getContrats().add(c);
//        c.setEtudiant(e);

//        eqr.save(eq);
//        cr.save(c);
        return null;
    }

    @Override
    public Etudiant addEtudiantToEquipeAndContract(Integer idE, Integer idContrat, Integer idEquipe) {

        Etudiant e = er.findById(idE).get();
                System.out.println("et = "+e);
        Contrat c = cr.findById(idContrat).get();
                System.out.println("c = "+c);
        Equipe eq = eqr.findById(idEquipe).get();
                System.out.println("eq = "+eq);


        c.setEtudiant(e);
//                .add(e);

//        Set<Etudiant> haja ;
//                haja = eq.getEtudiants();
//                if (haja.isEmpty()){
//
//                }
//        haja.add(e);
//        System.console().printf("HAjaa = ",haja);
//        System.console().printf("et = ",e);
//        System.console().printf("Cont = ",c);
//        System.console().printf("eq = ",eq);
//        eq.setEtudiants(haja);

//        cr.save(c);
//        eqr.save(eq);

        return null;
    }

    @Override
    public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {

//        er.findAll(x=>{})
        return null;
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        er.deleteById(idEtudiant);
    }

}
