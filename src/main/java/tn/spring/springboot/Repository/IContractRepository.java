package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Contrat;

@Repository
public interface IContractRepository extends JpaRepository <Contrat, Integer> {
}
