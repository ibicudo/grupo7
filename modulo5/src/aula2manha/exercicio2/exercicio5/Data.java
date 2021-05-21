package modulo5.src.aula2manha.exercicio5;

import java.util.*;

public class Data {

    public Data(int todayDay, int todayMonth, int todayYear){
        this.todayDay = todayDay;
        this.todayMonth = todayMonth;
        this.todayYear = todayYear;
    }

    public Integer getTodayDay() {
        return todayDay;
    }
    
    public Integer getTodayMonth() {
        return todayMonth;
    }

    public Integer getTodayYear() {
        return todayYear;
    }

    public Boolean IsCorret(){
        if (0 < todayDay && todayDay < 31)
            return false;
        if (0 < todayMonth && todayMonth < 13)
            return false;
        if (0 < todayYear)
            return false;
        return true;
    }

    public String toString(){
        return String.format("%02d/%02d/%04d", todayDay, todayMonth, todayYear);
    }

    public void addDay(){
        if (todayDay == 31 ){
            todayDay = 1;
            todayMonth++;
        }
        if (todayMonth == 13){
            todayMonth = 1;
            todayYear++;
        }
    }

    private Integer todayDay;
    private Integer todayMonth;
    private Integer todayYear;
}
