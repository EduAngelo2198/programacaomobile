package com.mycompany.pessoa1;

import java.util.Scanner;
import Nome.Pessoa;

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        double peso;
        
        Pessoa fernando = new Pessoa();
        
        System.out.print("Digite um nome para Pessoa 1: ");
        Scanner pes = new Scanner(System.in);
        nome = pes.next();
        fernando.setNome(nome);
        
        System.out.print("Digite uma idade para Pessoa 1: ");
        idade = pes.nextInt();
        fernando.setIdade(idade);
        
        System.out.print("Digite uma peso para Pessoa 1: ");
        peso = pes.nextDouble();
        fernando.setPeso(peso);
        
        
        Pessoa maria = new Pessoa();
        
        System.out.print("\nDigite um nome para Pessoa 2: ");
        nome = pes.next();
        maria.setNome(nome);
        
        System.out.print("Digite uma idade para Pessoa 2: ");
        idade = pes.nextInt();
        maria.setIdade(idade);
        
        System.out.print("Digite uma peso para Pessoa 2: ");
        peso = pes.nextDouble();
        maria.setPeso(peso);
        
        System.out.println("\nNome Pessoa 1: " + fernando.getNome());
        System.out.println("Idade Pessoa 1: " + fernando.getIdade());
        System.out.println("Peso Pessoa 1: " + fernando.getPeso() );
        fernando.andar();
        
        System.out.println("\nNome Pessoa 2: " + maria.getNome());
        System.out.println("Idade Pessoa 2: " + maria.getIdade());
        System.out.println("Peso Pessoa 2: " + maria.getPeso());
        maria.andar();
    }
}
