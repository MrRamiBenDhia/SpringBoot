package tn.spring.springboot.reposotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.spring.springboot.Entity.Departement;

@Repository
public interface DepartementRepo extends JpaRepository<Departement,Integer> {
}
