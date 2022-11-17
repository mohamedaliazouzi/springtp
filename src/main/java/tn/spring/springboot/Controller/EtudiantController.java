package tn.spring.springboot.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Service.IEtudiantService;

import java.util.List;

@RestController
@Tag(name = "Etudiant Crud")
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
     IEtudiantService iEtudiantService;



  // Save operation
    @PostMapping("/save-etudiands")
    @ResponseBody
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant)
    {
        Etudiant e = iEtudiantService.addEtudiant(etudiant);
        return e;
    }

    @GetMapping("/retrieve-etudiant/{idEtudiant}")
    @ResponseBody
    public Etudiant getEtudiant(@PathVariable("idEtudiant") Integer idEtudiant)
    {
        return iEtudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("/delete-etudiant/{idEtudiant}")
    @ResponseBody
    public Etudiant deleteEtudiant(@PathVariable("idEtudiant") Integer idEtudiant)
    {
       iEtudiantService.removeEtudiant(idEtudiant);
        return null;
    }

    @PutMapping("update-etudiant")
    @ResponseBody
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant)
    {
        return iEtudiantService.updateEtudiant(etudiant);
    }


    @GetMapping("/retrieve-all-etudiants")
    @ResponseBody

    public List<Etudiant> getEtudiants()
    {
        return iEtudiantService.retrieveAllEtudiants();
    }
}
