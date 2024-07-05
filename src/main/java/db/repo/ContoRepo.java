package db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import db.entity.ContoBancario;

@Repository
public interface  ContoRepo  extends JpaRepository<ContoBancario, Integer>{
    
}
