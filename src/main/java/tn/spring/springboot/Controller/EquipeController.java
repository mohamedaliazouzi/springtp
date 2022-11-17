package tn.spring.springboot.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.Service.IEquipeService;

import java.util.List;
@RestController
@Tag(name = "Equipe Crud")
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    IEquipeService iEquipeService;
    // Save operation
    @PostMapping("/save-equipe")
    @Operation(description = "add new Equipe")
    @ResponseBody
    public Equipe addEquipe(@RequestBody Equipe equipe)
    {
        Equipe e = iEquipeService.addEquipe(equipe);
        return e;
    }

    @GetMapping("/retrieve-equipe/{idEquipe}")
    @Operation(description = "retrieve equipe by ID")
    @ResponseBody
    public Equipe getEquipe(@PathVariable("idEquipe") Integer idEquipe)
    {
        return iEquipeService.retrieveEquipe(idEquipe);
    }

    @PutMapping("update-equipe")
    @Operation(description = "update equipe")
    @ResponseBody
    public Equipe updateEquipe(@RequestBody Equipe equipe)
    {
        return iEquipeService.updateEquipe(equipe);
    }


    @GetMapping("/retrieve-all-equipes")
    @Operation(description = "retrieve-all-equipes")
    @ResponseBody

    public List<Equipe> getequipes()
    {
        return iEquipeService.retrieveAllEquipes();
    }


}
