package com.example.demo32.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo32.db.entity.ContoBancario;
import com.example.demo32.db.repo.ContoRepo;


@Service
public class ContoService {
    
    @Autowired
    private ContoRepo repo;


    //Create - Update
    public ContoBancario saveConto(ContoBancario c){
        return repo.save(c);
    }


    //Read One
    public ContoBancario getCOntoById(int id){
        return repo.findById(id).get();
    }

    //Read ALl
    public List<ContoBancario> getAllConti(){
        return repo.findAll();
    }

    public void deleteConto(int id){
        repo.deleteById(id);
    }

   
}
