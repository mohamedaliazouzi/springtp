package tn.spring.springboot.Service;

import tn.spring.springboot.Entity.Contrat;

import java.util.List;

public interface IContractService {

    boolean updateContract(Contrat c ) ;
    boolean deleteContract(int c ) ;
    int addContract(Contrat c ) ;
    Contrat getContract(int contrat) ;
    List<Contrat> getContract( ) ;
}
