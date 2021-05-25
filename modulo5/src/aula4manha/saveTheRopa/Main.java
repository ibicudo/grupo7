package modulo5.src.aula4manha.saveTheRopa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();
        List<Vestuario> roupas = new ArrayList<Vestuario>();


        Vestuario vestuario1 = new Vestuario("Puma", "Camiseta");
        Vestuario vestuario2 = new Vestuario("Nike", "Calça");
        Vestuario vestuario3 = new Vestuario("Adidas", "Shorts");
        Vestuario vestuario4 = new Vestuario("Hering", "Meia Branca");


        roupas.add(vestuario1);
        roupas.add(vestuario2);
        roupas.add(vestuario3);

        Integer id = guardaRoupa.guardarVestuarios(roupas);

        guardaRoupa.mostrarVestuarios();
        guardaRoupa.guardarVestuarios(Arrays.asList(vestuario4), id);

        guardaRoupa.mostrarVestuarios();
        List<Vestuario> roupasRetiradas = guardaRoupa.devolverVestuarios(id);
        guardaRoupa.mostrarVestuarios();

    }
}
