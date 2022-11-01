package tn.spring.springboot.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Universite;
import tn.spring.springboot.service.IserviceUniversite;

import java.util.List;

@RestController
@Tag(name = "University Management :P ")

@RequestMapping("/Universite")
public class UniversiteController {

    @Autowired
    IserviceUniversite iserviceUniversite;


    @GetMapping("/addDepToUni/{idDep}/{idUni}")
    public void assignDepartementtoUniversity(@PathVariable("idDep")Integer idDep,@PathVariable("idUni") Integer idUniversite) {

        iserviceUniversite.assignDepartementtoUniversity(idDep, idUniversite);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Universite> getAllUniversite() {
//        List<Universite> list =
        return iserviceUniversite.retrieveAllUniversites();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Universite getById(@PathVariable("id") Long id) {
        return iserviceUniversite.retrieveUniversite(Math.toIntExact(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public Universite AddUniversite(@RequestBody Universite Universite) {
        return iserviceUniversite.addUniversite(Universite);
    }

    @PutMapping("/update")
    @ResponseBody
    public Universite update(@RequestBody Universite Universite) {
        return iserviceUniversite.updateUniversite(Universite);
    }

    @DeleteMapping("/remove/{id}")

    @ResponseBody

    public void removeOperateur(@PathVariable("id") int Id) {
        iserviceUniversite.retrieveUniversite(Id);
    }
}