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


}
