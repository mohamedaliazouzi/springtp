package tn.spring.springboot.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Service.IContractService;

import java.util.List;
@RestController
@Tag(name = "Contrat Crud")
@RequestMapping("/Contrat")
public class ContratController {
    @Autowired
    IContractService iContractService;

    //insertion
    @PostMapping("/save-contact")
    @Operation(description = "add new contract")
    @ResponseBody
    public int addContrat(@RequestBody Contrat contrat)
    {
        int contrat1 = iContractService.addContract(contrat);
        return contrat1;

    }
    @GetMapping("/retrieve-all-contrats")
    @Operation(description = "get all contract")
    @ResponseBody
    public List<Contrat> getContrats()
    {
        List<Contrat> contratList=iContractService.retrieveAllContrats();
        return contratList;
    }

    @GetMapping("/retrieve-contact/{idContrat}")
    @Operation(description = "retrieve contract by ID")
    @ResponseBody
    public Contrat getContrat(@PathVariable("idContrat") Integer idContrat)
    {
        return iContractService.retrieveContrat(idContrat);
    }
    @DeleteMapping("/delete-contrat/{idContrat}")
    @Operation(description = "Delete contract by ID")
    @ResponseBody
    public Contrat deleteContrat(@PathVariable("idContrat") Integer idContrat)
    {
        iContractService.deleteContract(idContrat);
        return null;
    }
    @PutMapping("/update-contract")
    @Operation(description = "Delete contract by ID")
    @ResponseBody
    public boolean updateContract(@RequestBody Contrat contrat)
    {
        return iContractService.updateContract(contrat);
    }



}
