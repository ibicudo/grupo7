package modulo5.src.aula4tarde.lachiqui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Convidado> convidados = new ArrayList<>();
        convidados.add(new ConvidadoMeli("Ingrid", "B.", "1"));
        convidados.add(new ConvidadoMeli("Ana", "S.", "2"));
        convidados.add(new ConvidadoMeli("Lucas", "V.", "3"));
        convidados.add(new ConvidadoMeli("Ton", "P.", "4"));
        convidados.add(new ConvidadoMeli("Fernando", "A.", "5"));
        convidados.add(new ConvidadoStandard("Joao", "D.", "6"));
        convidados.add(new ConvidadoStandard("Pedro", "J.", "7"));
        convidados.add(new ConvidadoStandard("Maria", "K.", "8"));

        List<FogosEvento> listaFogos = new ArrayList<>();
        List<FogosEvento> aux = null;
        for (int i = 0; i < 5; i++) {
            listaFogos.add(new Fogos());
        }
        for (int i = 0; i < 5; i++) {
            listaFogos.add(new FogosPacote(Arrays.asList(new Fogos(), new Fogos(), new FogosPacote(Arrays.asList(new Fogos())))));
        }

        Evento laChiqui = new Evento(listaFogos, convidados);

        laChiqui.soltarFogos();
        laChiqui.cortarBolo();
    }
}
