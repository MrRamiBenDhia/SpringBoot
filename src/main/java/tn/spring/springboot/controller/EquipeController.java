package tn.spring.springboot.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.service.IserviceEquipe;

import java.util.List;

@RestController
@Tag(name = "Equipe Management ;-)")

@RequestMapping("/Equipe")
public class EquipeController {

    @Autowired
    IserviceEquipe iserviceEquipe;


    @GetMapping("/getAll")
    @ResponseBody
    public List<Equipe> getAllEquipe() {
//        List<Equipe> list =
        return iserviceEquipe.retrieveAllEquipes();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Equipe getById(@PathVariable("id") Long id) {
        return iserviceEquipe.retrieveEquipe(Math.toIntExact(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public Equipe AddEquipe(@RequestBody Equipe Equipe) {
        return iserviceEquipe.addEquipe(Equipe);
    }

    @PutMapping("/update")
    @ResponseBody
    public Equipe update(@RequestBody Equipe Equipe) {
        return iserviceEquipe.updateEquipe(Equipe);
    }

    @DeleteMapping("/remove/{id}")

    @ResponseBody

    public void removeOperateur(@PathVariable("id") int Id) {

        iserviceEquipe.removeEquipe(Id);

    }


}
