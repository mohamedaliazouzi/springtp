package tn.spring.springboot.Controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Service.IDepartementService;

import java.util.List;

@RestController
@Tag(name = "Departement Crud")
@RequestMapping("/Departement")
public class DepartementController {
    @Autowired
    IDepartementService iDepartementService;

    // Save operation
    @PostMapping("/save-departement")
    @Operation(description = "add new departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody Departement departement)
    {
        Departement d = iDepartementService.addDepartement(departement);
        return d;
    }

    @GetMapping("/retrieve-departement/{idDepart}")
    @Operation(description = "retrieve departement by ID")
    @ResponseBody
    public Departement getDepartement(@PathVariable("idDepart") Integer idDepart)
    {
        return iDepartementService.retrieveDepartement(idDepart);
    }

    @PutMapping("update-departement")
    @Operation(description = "update departement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody Departement departement)
    {
        return iDepartementService.updateDepartement(departement);
    }


    @GetMapping("/retrieve-all-departements")
    @Operation(description = "Get all departements")
    @ResponseBody
    public List<Departement> getDepartements()
    {
        return iDepartementService.retrieveAllDepartements();
    }

    @DeleteMapping("/delete-departement/{idDepart}")
    @Operation(description = "delete departements by ID")
    @ResponseBody
    public Contrat deleteContrat(@PathVariable("idDepart") Integer idDepart)
    {
        iDepartementService.deleteDepartement(idDepart);
        return null;
    }
}
