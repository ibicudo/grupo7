package modulo5.src.aula3tarde;

public class Cajado implements Arma{
    private final String nome= "Cajado";

    @Override
    public void ataquePrimario() {
        System.out.println("Ataque primário com o cajado");
    }

    @Override
    public void ataqueSecundario() {
        System.out.println("Ataque secundário com o cajado");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Ataque especial com o cajado!!!!!!!");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cajado{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
