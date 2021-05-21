package modulo5.src.aula2tarde.exercicio4;

public class Diretor extends FuncionarioCLT {
    // Idealmente lucro viria de um objeto representando a empresa
    private final double LUCRO = 1000000;

    public Diretor(String nome) {
        super(nome, 15000);
    }

    public double getLucro() {
        return LUCRO;
    }

    @Override
    public void pagarSalario() {
        double salarioPago = this.getSalarioBase() + (this.LUCRO * 0.03);
    }
}
