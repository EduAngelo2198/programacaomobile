package com.mycompany.exercici3;

import Empregado.Empregado;

public class Main {
    public static void main(String[] args) {
        
        Empregado emp1 = new Empregado();
        
        System.out.println("Empregado 1 Nome: " + emp1.getNome());
        System.out.println("Empregado 1 Idade: " + emp1.getIdade());
        System.out.println("Empregado 1 Salário: " + emp1.getSal());
        emp1.salAno();
        
        Empregado emp2 = new Empregado("Jesualdo", 99, 1000.00);
        
        System.out.println("----------------------\nEmpregado 2 Nome: " + emp2.getNome());
        System.out.println("Empregado 2 Idade: " + emp2.getIdade());
        System.out.println("Empregado 2 Salário: " + emp2.getSal());
        emp2.salAno();
        
        Empregado emp3 = new Empregado("Sampaoli", 58, 500000.00);
        
        System.out.println("----------------------\nEmpregado 3 Nome: " + emp3.getNome());
        System.out.println("Empregado 3 Idade: " + emp3.getIdade());
        System.out.println("Empregado 3 Salário: " + emp3.getSal());
        emp3.salAno();
        
    }
}
