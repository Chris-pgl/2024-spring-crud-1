package db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import db.entity.ContoBancario;
import db.repo.ContoRepo;

@Service
public class ContoService {
    
    @Autowired
    private ContoRepo repo;


    //Create - Update
    public ContoBancario createConto(ContoBancario c){
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

    public void deleteConto(ContoBancario c){
        repo.delete(c);
    }

   
}
