package modulo5.src.aula2manha.exercicio1;

public class Main {
    public static void main(String[] args) {
        Estudante fernando = new Estudante("Fernando", 22);
        Estudante washington = new Estudante("Washington", 26);
        Estudante gustavo = new Estudante("Gustavo", 19);
        
        Disciplina geografia = new Disciplina(20, "Geografia");
        Disciplina historia = new Disciplina(25, "História");
        Disciplina matematica = new Disciplina(30, "Matemática");
        Disciplina portugues = new Disciplina(15, "Português");
        Disciplina fisica = new Disciplina(35, "Física");

        Turma turma8A = new Turma('A', 8);
        Turma turma8B = new Turma('B', 8);

        turma8A.addDisciplinas(geografia);
        turma8A.addDisciplinas(historia);
        turma8A.addDisciplinas(portugues);
        turma8A.addEstudante(fernando);
        turma8A.addEstudante(gustavo);

        turma8B.addDisciplinas(matematica);
        turma8B.addDisciplinas(historia);
        turma8B.addDisciplinas(fisica);
        turma8A.addEstudante(washington);
        turma8A.addEstudante(gustavo);

        System.out.println(fernando.getNome() + " -> Matrícula: " + fernando.getMatricula());
        System.out.println(washington.getNome() + " -> Matrícula: " + washington.getMatricula());

        /*
        *
        * Entre Turma e Estudante, e Turma e Disciplina, as relações são de composição, pois turma não existe sem ambos
        * As demais relações são de agregação, pois Disciplina e Estudante podem existir sem uma turma
        *
        */
    }
}
