package Boleto;

public class Boleto {
    
    private String nome;
    private String desc;
    private int quant;
    private double preco;

    public Boleto(String nome, String desc, int quant, double preco) {
        
        if(quant < 0){
            this.quant = 0; 
        }
        else if(preco < 0){
            this.preco = 0.0;
        }
        else{
            this.nome = nome;
            this.desc = desc;
            this.quant = quant;
            this.preco = preco;
        }
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getTotal(){
        double total = this.quant * this.preco;
        return total;
    }     
}
