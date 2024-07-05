package com.example.demo32.db.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ContoBancario {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    double saldo;
    String name;

    

    public ContoBancario() {
    }

    public ContoBancario(String name, double saldo){
        this.name = name;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double importo){
        try{
        if (importo <= 0) {
          System.out.println("L'importo da depositare deve essere positivo");
        }
        this.saldo += importo;
        }catch(Exception e){
            e.getMessage();
        }
    }

    public void preleva(double importo)  {
        try{
        if( importo > saldo ){
          System.out.println("Non hai sti soldiii!!");
        }
        this.saldo -= importo;
    }catch(Exception e){
        e.getMessage();
    }
}
        

    @Override
    public String toString() {
        return "ContoBancario [id=" + id +", nome="+ name +", saldo=" + saldo + "]";
    }

    


}
