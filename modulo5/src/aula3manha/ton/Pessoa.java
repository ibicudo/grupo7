package modulo5.src.aula3manha.ton;

public class Pessoa implements Precedente {
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
    public int precede(Object t) {
        Pessoa p = (Pessoa) t;
        return this.cpf.compareTo(p.cpf);
    }
}
