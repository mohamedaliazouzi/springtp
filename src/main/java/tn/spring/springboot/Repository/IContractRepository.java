package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Contrat;

import java.util.List;

@Repository
public interface IContractRepository extends JpaRepository <Contrat, Integer> {
}
