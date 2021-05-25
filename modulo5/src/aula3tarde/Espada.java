package modulo5.src.aula3tarde;

public class Espada implements Arma{
    private final String nome= "Espada";

    @Override
    public void ataquePrimario() {
        System.out.println("Ataque primário com espada");
    }

    @Override
    public void ataqueSecundario() {
        System.out.println("Ataque secundário com espada");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Ataque especial com espada!!!!!!!!!!!");
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Espada{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
