package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import tn.spring.springboot.Entity.Contrat;
import tn.spring.springboot.Repository.IContractRepository;

import java.util.List;

@Service
public class ContractService implements IContractService {

    @Autowired
    private IContractRepository iContractRepository;


    @Override
    public boolean updateContract(Contrat c) {
        if(iContractRepository.existsById(c.getIdContrat())) {
            iContractRepository.save(c) ;
            return true ;
        }
        else return false;

    }

    @Override
    public boolean deleteContract(int c) {
        iContractRepository.deleteById(c);
        return false;
    }

    @Override
    public int addContract(Contrat c) {
        return iContractRepository.save(c).getIdContrat();
    }

    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) iContractRepository.findAll();
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
            return iContractRepository.findById(idContrat).get();

    }

    @Override
    public void removeContrat(Integer idContrat) {
        iContractRepository.deleteById(idContrat);

    }

<<<<<<< Updated upstream
=======
    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        return null;
    }

   /* @Override
    public Void retrieveContratOrderByUniversiteId() {
        return (List<Contrat>) IContractRepository.;
    }*/

>>>>>>> Stashed changes
    @Override
    public Contrat getContract(int contratc) {
        return (Contrat) iContractRepository;
    }

    @Override
    public List<Contrat> getContract() {
        return null;
    }

}
