package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Universite;
import tn.spring.springboot.Service.IUniversiteService;

import java.util.List;
@RestController
public class UniversiteController {
    @Autowired
    IUniversiteService iUniversiteService;

    // Save operation
    @PostMapping("/save-universite")
    @ResponseBody
    public Universite addUniversite(@RequestBody Universite universite)
    {
        Universite u = iUniversiteService.addUniversite(universite);
        return u;
    }

    @GetMapping("/retrieve-universite/{idUniv}")
    @ResponseBody
    public Universite getUniversite(@PathVariable("idUniv") Integer idUniv)
    {
        return iUniversiteService.retrieveUniversite(idUniv);
    }

    @PutMapping("update-universite")
    @ResponseBody
    public Universite updateUniversite(@RequestBody Universite universite)
    {
        return iUniversiteService.updateUniversite(universite);
    }


    @GetMapping("/retrieve-all-universites")
    @ResponseBody

    public List<Universite> getUniversites()
    {
        return iUniversiteService.retrieveAllUniversites();
    }


}
