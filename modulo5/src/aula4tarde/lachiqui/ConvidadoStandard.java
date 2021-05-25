package modulo5.src.aula4tarde.lachiqui;

public class ConvidadoStandard extends Convidado{

    public ConvidadoStandard(String nome, String sobrenome, String numeroConvite) {
        super(nome, sobrenome, numeroConvite);
    }

    @Override
    public void comerBolo() {
        System.out.println(this.getNome() + " " + this.getSobrenome() + " nom nom nom");
    }
}
