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
        return false;
    }

    @Override
    public int addContract(Contrat c) {
        return 0;
    }

    @Override
    public Contrat getContract(int contratc) {
        return null;
    }

    @Override
    public List<Contrat> getContract() {
        return null;
    }
}
