package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Service.IContractService;

import java.util.List;
@RestController
public class ContratController {
    @Autowired
    IContractService iContractService;

    //insertion
    @PostMapping("/save-contact")
    @ResponseBody
    public int addContrat(@RequestBody Contrat contrat)
    {
        int contrat1 = iContractService.addContract(contrat);
        return contrat1;

    }
    @GetMapping("/retrieve-all-contrats")
    @ResponseBody

    public List<Contrat> getContrats()
    {
        List<Contrat> contratList=iContractService.retrieveAllContrats();
        return contratList;
    }

    @GetMapping("/retrieve-contact/{idContrat}")
    @ResponseBody
    public Contrat getContrat(@PathVariable("idContrat") Integer idContrat)
    {
        return iContractService.retrieveContrat(idContrat);
    }
    @DeleteMapping("/delete-contrat/{idContrat}")
    @ResponseBody
    public Contrat deleteContrat(@PathVariable("idContrat") Integer idContrat)
    {
        iContractService.removeContrat(idContrat);
        return null;
    }



}
