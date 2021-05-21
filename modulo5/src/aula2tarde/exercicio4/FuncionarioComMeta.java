package modulo5.src.aula2tarde.exercicio4;

public abstract class FuncionarioComMeta extends FuncionarioCLT {
    private int metasBatidas;
    private double percentualBonificacao;

    public FuncionarioComMeta(String nome, double salarioBase, int metasBatidas, double percentualBonificacao) {
        super(nome, salarioBase);
        this.metasBatidas = metasBatidas;
        this.percentualBonificacao = percentualBonificacao;
    }

    public int getMetasBatidas() {
        return metasBatidas;
    }

    public void setMetasBatidas(int metasBatidas) {
        this.metasBatidas = metasBatidas;
    }

    public double getPercentualBonificacao() {
        return percentualBonificacao;
    }

    public void setPercentualBonificacao(double percentualBonificacao) {
        this.percentualBonificacao = percentualBonificacao;
    }

    public void pagarSalario() {
        double salarioPago = this.getSalarioBase() * (1 + this.metasBatidas * this.percentualBonificacao);
        System.out.println("O valor pago foi de: " + salarioPago);
    }
}
