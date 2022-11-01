package tn.spring.springboot.controller;

import com.sun.javafx.runtime.eula.Eula;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.service.IserviceDepartement;
import tn.spring.springboot.service.IserviceEtudiant;

import java.util.List;
import java.util.Set;

@RestController
@Tag(name = "Etudiant Management ;-)")

@RequestMapping("/Etudiant")
public class EtudiantController {

    @Autowired
    IserviceEtudiant iserviceEtudiant;
    IserviceDepartement iserviceDepartement;

    @GetMapping("/addEtudiantToDepartement/{idE}/{idD}")
    @ResponseBody
    public boolean assignEtudiantToDepartement (@PathVariable("idE")Integer etudiantId, @PathVariable("idD")Integer departementId){

       iserviceEtudiant.assignEtudiantToDepartement(etudiantId,departementId);

       return true;
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Etudiant> getAllEtudiant() {
//        List<Etudiant> list =
        return iserviceEtudiant.retrieveAllEtudiants();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Etudiant getById(@PathVariable("id") Long id) {
        return iserviceEtudiant.retrieveEtudiant(Math.toIntExact(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public Etudiant AddEtudiant(@RequestBody Etudiant etudiant) {
        return iserviceEtudiant.addEtudiant(etudiant);
    }

    @PutMapping("/update")
    @ResponseBody
    public Etudiant update(@RequestBody Etudiant etudiant) {
        return iserviceEtudiant.updateEtudiant(etudiant);
    }

    @DeleteMapping("/remove/{id}")

    @ResponseBody

    public void removeOperateur(@PathVariable("id") int Id) {

        iserviceEtudiant.removeEtudiant(Id);

    }


}
