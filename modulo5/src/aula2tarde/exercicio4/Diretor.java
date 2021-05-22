package modulo5.src.aula2tarde.exercicio4;

public class Diretor extends FuncionarioCLT {
    // Idealmente lucro viria de um objeto representando a empresa
    private final double LUCRO = 1000000;
    private double salarioPago = 0; 
    public Diretor(String nome) {
        super(nome, 15000);
    }

    public double getLucro() {
        return LUCRO;
    }

    @Override
    public void pagarSalario() {
        this.salarioPago = this.getSalarioBase() + (this.LUCRO * 0.03);
    }

    public double getSalarioPago() {
        return salarioPago;
    }
}
