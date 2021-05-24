package modulo5.src.aula3tarde;

public class Arco implements Arma{
    private final String nome= "Arco";

    @Override
    public void ataquePrimario() {
        System.out.println("Ataque primário com o arco");
    }

    @Override
    public void ataqueSecundario() {
        System.out.println("Ataque secundário com o arco");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Ataque Especial com o arco !!!!!!!!!!");

    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Arco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
