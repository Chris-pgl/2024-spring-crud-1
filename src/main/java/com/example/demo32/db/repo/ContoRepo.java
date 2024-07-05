package com.example.demo32.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo32.db.entity.ContoBancario;



@Repository
public interface  ContoRepo  extends JpaRepository<ContoBancario, Integer>{
    
}
