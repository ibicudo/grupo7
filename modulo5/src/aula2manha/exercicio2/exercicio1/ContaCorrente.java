package modulo5.src.aula2manha.exercicio2.exercicio1;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente() {
        this.saldo = 0;
    }

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente conta) {
        this.saldo = conta.getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saque(double valor) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public void devolucao(double valor) {
        // Devolvendo o valor para a Conta Corrente.
        this.deposito(valor);
    }

    public void transferencia(double valor, ContaCorrente conta) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            conta.deposito(valor);
        }
    }
}
