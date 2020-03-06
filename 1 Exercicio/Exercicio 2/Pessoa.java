package Nome;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void andar(){
        System.out.println("A pessoa começou a andar");
    }
    
    public void comer(){
        System.out.println("A pessoa começou a comer");
    }
    
    public void dormir(){
        System.out.println("A pessoa começou a dormir");
    }
}
