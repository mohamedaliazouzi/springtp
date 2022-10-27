package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Repository.IEtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService {
    @Autowired
    private IEtudiantRepository ietudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return ietudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return ietudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return ietudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return ietudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        ietudiantRepository.deleteById(idEtudiant);
    }
}
