package modulo5.src.aula4tarde.lachiqui;

public abstract class Convidado {
    private String nome;
    private String sobrenome;
    private String numeroConvite;

    public abstract void comerBolo();

    public Convidado(String nome, String sobrenome, String numeroConvite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConvite = numeroConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNumeroConvite() {
        return numeroConvite;
    }

    public void setNumeroConvite(String numeroConvite) {
        this.numeroConvite = numeroConvite;
    }
}
