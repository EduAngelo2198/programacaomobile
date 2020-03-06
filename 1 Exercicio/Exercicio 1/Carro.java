package Modelo;

public class Carro {
    
    private String modelo;
    private int ano;
    private double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }   
    
    public void acelear(){
        System.out.println("O carro começou a acelerar");
    }
    
    public void brecar(){
        System.out.println("O carro começou a brecar");
    }
    
    public void parar(){
        System.out.println("O carro começou a parar");
    }
    
}
