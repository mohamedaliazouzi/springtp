package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Repository.IEquipeRepository;

import java.util.List;
@Service
public class EquipeService implements IEquipeService {

    @Autowired
    private IEquipeRepository iEquipeRepository;


    @Override
    public List<Equipe> retrieveAllEquipes() {
        return (List<Equipe>) iEquipeRepository.findAll();

    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return iEquipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return iEquipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return iEquipeRepository.findById(idEquipe).get();
    }
}
