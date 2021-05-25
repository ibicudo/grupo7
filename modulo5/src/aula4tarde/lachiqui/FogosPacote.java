package modulo5.src.aula4tarde.lachiqui;

import java.util.List;

public class FogosPacote implements FogosEvento{

    List<FogosEvento> pacoteDeFogos;

    public FogosPacote(List<FogosEvento> pacoteDeFogos) {
        this.pacoteDeFogos = pacoteDeFogos;
    }

    @Override
    public void explodir() {
        pacoteDeFogos.forEach(FogosEvento::explodir);
    }

    public List<FogosEvento> getPacoteDeFogos() {
        return pacoteDeFogos;
    }

    public void setPacoteDeFogos(List<FogosEvento> pacoteDeFogos) {
        this.pacoteDeFogos = pacoteDeFogos;
    }

}
