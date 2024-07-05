package db.entity;

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

    public ContoBancario(double saldo){
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

    public void deposita(double importo) throws Exception {
        if (importo <= 0) {
            throw new Exception("L'importo da depositare deve essere positivo");
        }
        this.saldo += importo;
    }

    public void preleva(double importo) throws Exception {
        if( importo > saldo ){
            throw new Exception("Non hai abbastanza soldi");
        }
        this.saldo -= importo;
    }

    @Override
    public String toString() {
        return "ContoBancario [id=" + id + ", saldo=" + saldo + "]";
    }

    


}
