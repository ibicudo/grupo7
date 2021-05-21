package modulo5.src.aula2manha.exercicio2.exercicio2;

public class Counter {
    int counter = 0;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter(Counter counter) {
        this.counter = counter.getCounter();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void incrementa() {
        this.counter += 1;
    }

    public void incrementa(int quantidade) {
        if (quantidade > 0) {
            this.counter += quantidade;
        }
    }

    public void decrementa() {
        this.counter -= 1;
    }

    public void decrementa(int quantidade) {
        if (quantidade > 0) {
            this.counter -= quantidade;
        }
    }
}
