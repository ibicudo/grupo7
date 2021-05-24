package modulo5.src.aula3manha.exercicio1;

public class Celular implements Precedente<Celular>{
    private String number;
    private Pessoa holder;

    public Celular(String number, Pessoa holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public Pessoa getHolder() {
        return holder;
    }

    public void setHolder(Pessoa holder) {
        this.holder = holder;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int precede(Celular cel) {
        return this.number.compareTo(cel.number);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", holder=" + holder +
                '}';
    }
}
