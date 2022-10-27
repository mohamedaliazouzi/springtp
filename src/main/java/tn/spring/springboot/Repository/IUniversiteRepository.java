package tn.spring.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Universite;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite, Integer> {
}
