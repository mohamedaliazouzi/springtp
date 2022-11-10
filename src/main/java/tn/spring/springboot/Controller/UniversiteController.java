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



}
