package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Entity.Universite;
import tn.spring.springboot.Repository.IUniversiteRepository;

import java.util.List;

@Service
public class UniversiteService implements IUniversiteService {
    @Autowired
    private IUniversiteRepository iUniversiteRepository;


    @Override
    public List<Universite> retrieveAllUniversites() {
        return (List<Universite>) iUniversiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return iUniversiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return iUniversiteRepository.save(u);
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return iUniversiteRepository.findById(idUniversite).get();
    }
}
