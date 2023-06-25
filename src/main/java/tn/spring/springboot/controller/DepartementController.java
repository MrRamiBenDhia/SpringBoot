package tn.spring.springboot.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.service.IserviceDepartement;

import java.util.List;

@RestController
@Tag(name = "Departement Management ;-)")

@RequestMapping("/Departement")
public class DepartementController {

    @Autowired
    IserviceDepartement iserviceDepartement;


    @GetMapping("/getAll")
    @ResponseBody
    public List<Departement> getAllDepartement() {
//        List<Departement> list =
        return iserviceDepartement.retrieveAllDepartements();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Departement getById(@PathVariable("id") Long id) {
        return iserviceDepartement.retrieveDepartement(Math.toIntExact(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public Departement AddDepartement(@RequestBody Departement Departement) {
        return iserviceDepartement.addDepartement(Departement);
    }

    @PutMapping("/update")
    @ResponseBody
    public Departement update(@RequestBody Departement Departement) {
        return iserviceDepartement.updateDepartement(Departement);
    }

    @DeleteMapping("/remove/{id}")

    @ResponseBody

    public void removeOperateur(@PathVariable("id") int Id) {

        iserviceDepartement.removeDepartement(Id);

    }


}
