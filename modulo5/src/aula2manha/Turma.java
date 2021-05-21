package modulo5.src.aula2manha;

import java.util.*;

public class Turma {
    private char codigo;
    private int serie;


    private Vector<Disciplina> disciplinas = new Vector<>();
    private Vector<Estudante> estudantes = new Vector<>();

    public Turma(char codigo, int serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public char getCodigo() {
        return codigo;
    }

    public int getSerie() {
        return serie;
    }

    public void addEstudante(Estudante estudante){
        this.estudantes.add(estudante);
    }

    public void addDisciplinas(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

}
