package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Contrat;

import java.util.List;

@Repository
public interface IContractRepository extends JpaRepository <Contrat, Integer> {


    /*@Query("select c from Contrat c join Universite E on c.etudiant.departement member E.departements where E.idUniv=:x")
     List<Contrat> retrieveContratOrderByUniversiteId(@Param("idDepart") int idDepart);*/



}
