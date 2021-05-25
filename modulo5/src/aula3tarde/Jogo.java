package modulo5.src.aula3tarde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Jogo {
    public static void main(String[] args) {
        ArrayList<Arma> armas= new ArrayList<>();
        armas.add(new Espada());
        armas.add(new Arco());
        armas.add(new Cajado());

        //armas.sort((a,b)-> a.getNome().compareTo(b.getNome()));
        armas.sort(Comparator.comparing(Arma::getNome));

        System.out.println(armas);


        Personagem fernando = new Personagem(Classe.Mago, "Mestre dos Magos", 2.0, armas.get(0));
        fernando.getArma().ataqueEspecial();
        fernando.getArma().ataquePrimario();
        fernando.getArma().ataqueSecundario();

        fernando.setArma(armas.get(1));
        fernando.getArma().ataqueEspecial();
        fernando.getArma().ataquePrimario();
        fernando.getArma().ataqueSecundario();

        fernando.setArma(armas.get(2));
        fernando.getArma().ataqueEspecial();
        fernando.getArma().ataquePrimario();
        fernando.getArma().ataqueSecundario();


    }
}
