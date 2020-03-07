package Construtor;

public class Construtor {
    
    private String nomeDog;
    private int idadeDog;

    public Construtor(String nomeDog) {
        this.nomeDog = nomeDog;
    }

    public Construtor(int idadeDog) {
        this.idadeDog = idadeDog;
    }

    public Construtor(String nomeDog, int idadeDog) {
        this.nomeDog = nomeDog;
        this.idadeDog = idadeDog;
    }

    public String getNomeDog() {
        return nomeDog;
    }

    public void setNomeDog(String nomeDog) {
        this.nomeDog = nomeDog;
    }

    public int getIdadeDog() {
        return idadeDog;
    }

    public void setIdadeDog(int idadeDog) {
        this.idadeDog = idadeDog;
    }
    
}
