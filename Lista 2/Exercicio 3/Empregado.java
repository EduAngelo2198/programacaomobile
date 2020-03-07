package Empregado;

public class Empregado {
    private String nome;
    private int idade;
    private double sal;

    public Empregado(){

    } 

    public Empregado(String nome, int idade, double sal){

        if(sal < 0){
            this.sal = 0.0;
        }
        else{
            this.nome = nome;
            this.idade = idade;
            this.sal = sal;
        }
    }

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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    
    public void salAno(){
        System.out.println("Salario anual: " + this.sal * 12);
    }
}
