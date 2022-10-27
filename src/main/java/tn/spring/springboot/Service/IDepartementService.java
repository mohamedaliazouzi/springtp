package tn.spring.springboot.Service;

import tn.spring.springboot.Entity.Departement;

import java.util.List;

public interface IDepartementService {

    List<Departement> retrieveAllDepartements();

    Departement addDepartement (Departement d);

    Departement updateDepartement (Departement d);

    Departement retrieveDepartement (Integer idDepart);
}
