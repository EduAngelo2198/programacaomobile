package com.mycompany.exercici2;

import Boleto.Boleto;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        
        DecimalFormat arredonda = new DecimalFormat();
        arredonda.applyPattern("#.##");
        Boleto boleto = new Boleto("Carta", "Carta de baralho", 12, 0.20);
        
        System.out.println("Nome do item: " + boleto.getNome());
        System.out.println("Descrição do item: " + boleto.getDesc());
        System.out.println("Quantidade comprada: " + boleto.getQuant());
        System.out.println("Preço unitário: " + boleto.getPreco());
        System.out.println("Valor da fatura: " + arredonda.format(boleto.getTotal()));
        
    }
}
