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


}
