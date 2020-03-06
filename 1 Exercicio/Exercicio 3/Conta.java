package Conta;

public class Conta 
{
    private int numeroConta;
    private String nomeDono;
    private double saldo;
    
    public Conta(int numConta, String nomeConta, double saldoConta){
        this.numeroConta = numConta;
        this.nomeDono = nomeConta;
        this.saldo = saldoConta;
    }
    
    public void depositar(double valorDeposito){            
        this.saldo = this.saldo + valorDeposito;        
    }
    
    public void sacar(double valorSaque){
        
        if(valorSaque < this.saldo){          
            this.saldo = this.saldo - valorSaque;
        }
        
        else{        
            System.out.println("Saldo insuficiente !!");
        }
    }
    
    public void saldo(){
        if(this.saldo > 0){
            System.out.println("Saldo final R$: " + this.saldo);
        }
    }
}

