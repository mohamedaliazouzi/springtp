package tn.spring.springboot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Service.IDepartementService;

import java.util.List;

@RestController
public class DepartementController {
    @Autowired
    IDepartementService iDepartementService;

    // Save operation
    @PostMapping("/save-departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody Departement departement)
    {
        Departement d = iDepartementService.addDepartement(departement);
        return d;
    }

    @GetMapping("/retrieve-departement/{idDepart}")
    @ResponseBody
    public Departement getDepartement(@PathVariable("idDepart") Integer idDepart)
    {
        return iDepartementService.retrieveDepartement(idDepart);
    }

    @PutMapping("update-departement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody Departement departement)
    {
        return iDepartementService.updateDepartement(departement);
    }


    @GetMapping("/retrieve-all-departements")
    @ResponseBody

    public List<Departement> getDepartements()
    {
        return iDepartementService.retrieveAllDepartements();
    }


}
