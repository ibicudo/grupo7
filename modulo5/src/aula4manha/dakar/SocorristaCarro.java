package modulo5.src.aula4manha.dakar;

public class SocorristaCarro  implements Socorrista<Carro>{
    public void socorrer(Carro c){
        System.out.println("Socorrendo Carro: " + c.getPatente());
    }
}
