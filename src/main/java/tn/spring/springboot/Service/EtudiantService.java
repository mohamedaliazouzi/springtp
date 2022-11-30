package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Entity.Departement;
import tn.spring.springboot.Entity.Equipe;
import tn.spring.springboot.Entity.Etudiant;
import tn.spring.springboot.Repository.IContractRepository;
import tn.spring.springboot.Repository.IDepartementRepository;
import tn.spring.springboot.Repository.IEquipeRepository;
import tn.spring.springboot.Repository.IEtudiantRepository;

import java.util.List;

@Service
public class EtudiantService implements IEtudiantService {


    @Autowired
    private IEtudiantRepository ietudiantRepository;
    @Autowired
    private IDepartementRepository iDepartementRepository;
    @Autowired
    private IContractRepository iContractRepository;
    @Autowired
    private IEquipeRepository iEquipeRepository;

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
    @Override
    public void assignEtudiantToDepartement(Long idEtudiant, Integer idDepart) {
        Etudiant etudiant = ietudiantRepository.findById(Math.toIntExact(idEtudiant)).orElse(null);
        Departement departement = iDepartementRepository.findById(idDepart).orElse(null);
        etudiant.setDepartement(departement);
        ietudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Etudiant e1= ietudiantRepository.save(e);
        Contrat contrat = iContractRepository.findById(idContrat).orElse(null);
        Equipe equipe = iEquipeRepository.findById(idEquipe).orElse(null);
        contrat.setEtudiant(e1);
        equipe.getEquipes().add(e1);
        iContractRepository.save(contrat);
        iEquipeRepository.save(equipe);

        return e1;
    }
}
