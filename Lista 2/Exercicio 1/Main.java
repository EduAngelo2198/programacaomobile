package com.mycompany.exercici1;

import Construtor.Construtor;

public class Main {
    public static void main(String[] args) {
        
        Construtor cachorro = new Construtor("Gerivaldo");
        
        System.out.println("Nome Dog: " + cachorro.getNomeDog());
        System.out.println("Idade Dog: " + cachorro.getIdadeDog());
        
        Construtor cachorro2 = new Construtor(5);
        
        System.out.println("\nNome Dog: " + cachorro2.getNomeDog());
        System.out.println("Idade Dog: " + cachorro2.getIdadeDog());
        
        Construtor cachorro3 = new Construtor("Jade", 4);
        
        System.out.println("\nNome Dog: " + cachorro3.getNomeDog());
        System.out.println("Idade Dog: " + cachorro3.getIdadeDog());
                
    }
}
