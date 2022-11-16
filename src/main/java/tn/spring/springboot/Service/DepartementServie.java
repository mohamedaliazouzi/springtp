package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Repository.IDepartementRepository;

import java.util.List;

@Service
public class DepartementServie implements IDepartementService {
    @Autowired
    IDepartementRepository iDepartementRepository;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return (List<Departement>) iDepartementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return iDepartementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return iDepartementRepository.save(d);
    }
    @Override
    public boolean deleteDepartement(int c) {
        iDepartementRepository.deleteById(c);
        return false;
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return iDepartementRepository.findById(idDepart).get();
    }
}
