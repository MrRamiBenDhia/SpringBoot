package tn.spring.springboot.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.service.IserviceContrat;

import java.util.List;

@RestController
@Tag(name = "Contrat Management ;-)")

@RequestMapping("/Contrat")
public class ContratController {

    @Autowired
    IserviceContrat iserviceContrat;


    @GetMapping("/getAll")
    @ResponseBody
    public List<Contrat> getAllContrat() {
//        List<Contrat> list =
        return iserviceContrat.retrieveAllContrats();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Contrat getById(@PathVariable("id") Long id) {
        return iserviceContrat.retrieveContrat(Math.toIntExact(id));
    }

    @PostMapping("/add")
    @ResponseBody
    public Contrat AddContrat(@RequestBody Contrat Contrat) {
        return iserviceContrat.addContrat(Contrat);
    }

    @PutMapping("/update")
    @ResponseBody
    public Contrat update(@RequestBody Contrat Contrat) {
        return iserviceContrat.updateContrat(Contrat);
    }

    @DeleteMapping("/remove/{id}")

    @ResponseBody

    public void removeOperateur(@PathVariable("id") int Id) {

        iserviceContrat.removeContrat(Id);

    }


}
