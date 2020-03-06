package Carro;

import Modelo.Carro;

public class Main {

    public static void main(String[] args) {
        
       Carro corsa = new Carro();
       corsa.setModelo("Corsa");
       corsa.setAno(2002);
       corsa.setPreco(12500.50);
       
       System.out.println("Modelo: " + corsa.getModelo());
       System.out.println("Ano: " + corsa.getAno());
       System.out.println("Preço: " + corsa.getPreco());
       corsa.brecar();
        
    }
    
}
