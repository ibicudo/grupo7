package modulo5.src.aula4tarde.lachiqui;

public class ConvidadoMeli extends Convidado{


    public ConvidadoMeli(String nome, String sobrenome, String numeroConvite) {
        super(nome, sobrenome, numeroConvite);
    }

    @Override
    public void comerBolo() {
        System.out.println(this.getNome() + " " + this.getSobrenome() + " Viva la Chiqui !!");
    }
}
