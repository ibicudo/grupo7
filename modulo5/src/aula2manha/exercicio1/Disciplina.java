package modulo5.src.aula2manha.exercicio1;

import java.util.*;

public class Disciplina {
    private int cargaHoraria;
    private String nome; 


    public Disciplina( int cargaHoraria, String nome){
        this.cargaHoraria = cargaHoraria;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

}
