package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Etudiant;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
