package modulo5.src.aula4manha.dakar;

public class Moto implements Veiculo {
    private int velocidade;
    private int aceleracao;
    private int anguloDeGiro;
    private String placa;
    private int patente;
    private final double peso = 300;
    private final int rodas = 2;

    public Moto(int velocidade, int aceleracao, int anguloDeGiro, String placa){
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
    }
    @Override
    public void setPatente(int patente) {
        this.patente = patente;
    }
    @Override
    public String getPlaca() {
        return placa;
    }
    @Override
    public int getVelocidade() {
        return velocidade;
    }
    @Override
    public int getAceleracao() {
        return aceleracao;
    }
    @Override
    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }
    @Override
    public int getPatente() {
        return patente;
    }
    @Override
    public double getPeso() {
        return peso;
    }
    @Override
    public int getRodas() {
        return rodas;
    }
}
