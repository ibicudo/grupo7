package modulo5.src.aula4manha.saveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> armario = new HashMap<Integer, List<Vestuario>>();;
    private Integer contador = -1;

    public GuardaRoupa() {
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        contador++;
        armario.put(contador, listaDeVestuario);
        return contador;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario, Integer posicao) {
        List<Vestuario> roupasGuardadas = armario.get(posicao);
        if (roupasGuardadas != null) {
            roupasGuardadas.addAll(listaDeVestuario);
            return posicao;
        }
        return guardarVestuarios(listaDeVestuario);
    }

    public void mostrarVestuarios() {
        System.out.println("Início da lista.");
        armario.forEach( (id, listaDeRoupas) -> {
            System.out.println("Id: " + id + " " + listaDeRoupas.toString());
        } );
        System.out.println("Fim da lista.");
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> roupasGuardadas = armario.get(id);
        if (roupasGuardadas != null) {
            armario.remove(id);
            return roupasGuardadas;
        }
        return roupasGuardadas;
    }
}
