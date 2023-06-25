package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Equipe;

@Repository
public interface EquipeRepo extends JpaRepository<Equipe,Integer> {
}
