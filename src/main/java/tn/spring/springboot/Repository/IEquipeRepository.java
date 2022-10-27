package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Equipe;

@Repository
public interface IEquipeRepository extends JpaRepository<Equipe, Integer> {
}
