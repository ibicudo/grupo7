package modulo5.src.aula4manha.dakar;

public class SocorristaMoto implements Socorrista<Moto> {
    public void socorrer(Moto m){
        System.out.println("Socorrendo Moto: " + m.getPatente());
    }
}
