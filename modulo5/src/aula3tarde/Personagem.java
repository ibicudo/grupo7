package modulo5.src.aula3tarde;

public class Personagem {
    private Classe tipoPersonagem;
    private String nome;
    private double nivel;
    private Arma arma;

    public Personagem(Classe tipoPersonagem, String nome, double nivel, Arma arma) {
        this.tipoPersonagem = tipoPersonagem;
        this.nome = nome;
        this.nivel = nivel;
        this.arma=arma;
    }

    public Classe getTipoPersonagem() {
        return tipoPersonagem;
    }

    public void setTipoPersonagem(Classe tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
