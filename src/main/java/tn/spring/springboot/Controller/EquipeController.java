package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.Service.IEquipeService;

import java.util.List;
@RestController
public class EquipeController {
    @Autowired
    IEquipeService iEquipeService;
    // Save operation
    @PostMapping("/save-equipe")
    @ResponseBody
    public Equipe addEtudiant(@RequestBody Equipe equipe)
    {
        Equipe e = iEquipeService.addEquipe(equipe);
        return e;
    }

    @GetMapping("/retrieve-equipe/{idEquipe}")
    @ResponseBody
    public Equipe getEquipe(@PathVariable("idEquipe") Integer idEquipe)
    {
        return iEquipeService.retrieveEquipe(idEquipe);
    }

    @PutMapping("update-equipe")
    @ResponseBody
    public Equipe updateEquipe(@RequestBody Equipe equipe)
    {
        return iEquipeService.updateEquipe(equipe);
    }


    @GetMapping("/retrieve-all-equipes")
    @ResponseBody

    public List<Equipe> getequipes()
    {
        return iEquipeService.retrieveAllEquipes();
    }


}
