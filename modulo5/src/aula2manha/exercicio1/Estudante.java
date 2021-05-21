package modulo5.src.aula2manha.exercicio1;

public class Estudante {
    private String nome;
    private int idade;
    private int matricula;
    private Turma turma;

    private static int qtdAlunos = 1;

    public  Estudante(String nome,  int idade){
        this.nome =  nome;
        this.idade = idade;
        
        this.matricula = qtdAlunos;
        qtdAlunos++;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public Turma getTurma() {
        return turma;
    }
    
}
