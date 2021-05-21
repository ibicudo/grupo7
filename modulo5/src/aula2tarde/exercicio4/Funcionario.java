package modulo5.src.aula2tarde.exercicio4;

public abstract class Funcionario {
    private String nome;

    public Funcionario() {
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void pagarSalario();
}
