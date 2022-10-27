package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Departement;

@Repository
public interface IDepartementRepository extends JpaRepository<Departement, Integer> {
}
