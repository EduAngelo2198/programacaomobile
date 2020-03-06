package com.mycompany.banco;

import Conta.Conta;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        
      double val;    
      Conta edu = new Conta(01, "Eduardo", 0.0);
        
      System.out.println("Digite o valor do depósito: ");
      System.out.print("R$: ");
      Scanner n = new Scanner(System.in);         
      val = n.nextDouble();       
      edu.depositar(val);
            
      for(int i = 0; i < 2; i++){
          
        System.out.println("Digite o valor do saque: ");
        System.out.print("R$: ");        
        val = n.nextDouble();   
        edu.sacar(val);
        
      }
      
      edu.saldo();
    }
}

