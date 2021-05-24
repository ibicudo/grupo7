package modulo5.src.aula3manha.exercicio1;

public class Pessoa implements Precedente<Pessoa> {
    private String nome;
    private String cpf;

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    
    @Override
    public int precede(Pessoa p) {
        return this.cpf.compareTo(p.cpf);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
