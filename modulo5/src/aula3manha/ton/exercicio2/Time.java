package modulo5.src.aula3manha.ton.exercicio2;

import java.util.Date;

public class Time {
    private long start;
    private long stop;

    public void start(){
        this.start = new Date().getTime();
    }
    public void stop(){
        this.stop = new Date().getTime();
    }

    public long getTime(){
        return this.stop- this.start;
    }
}
