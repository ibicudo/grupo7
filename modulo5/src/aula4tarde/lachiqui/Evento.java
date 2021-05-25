package modulo5.src.aula4tarde.lachiqui;

import java.util.List;

public class Evento {

    List<FogosEvento> fogos;
    List<Convidado> convidados;

    public Evento(List<FogosEvento> fogos, List<Convidado> convidados) {
        this.fogos = fogos;
        this.convidados = convidados;
    }

    public void cortarBolo() {
        System.out.println("O bolo foi cortado em " + convidados.size() + " pedaços");
        convidados.forEach(Convidado::comerBolo);
    }

    public void soltarFogos(){
        fogos.forEach(FogosEvento::explodir);
    }

    public List<FogosEvento> getFogos() {
        return fogos;
    }

    public void setFogos(List<FogosEvento> fogos) {
        this.fogos = fogos;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void setConvidados(List<Convidado> convidados) {
        this.convidados = convidados;
    }
}
