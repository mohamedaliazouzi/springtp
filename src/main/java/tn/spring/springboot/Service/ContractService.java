package tn.spring.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
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
        return false;
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

    @Override
    public Contrat getContract(int contratc) {
        return (Contrat) iContractRepository;
    }

    @Override
    public List<Contrat> getContract() {
        return null;
    }
}
