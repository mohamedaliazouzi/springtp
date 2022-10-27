package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Service.IContractService;

import java.util.List;
@RestController
public class ContratController {
    @Autowired
    IContractService iContractService;


}
