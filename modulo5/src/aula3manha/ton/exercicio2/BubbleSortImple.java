package modulo5.src.aula3manha.ton.exercicio2;

import modulo5.src.aula3manha.ton.exercicio1.Precedente;

import java.util.Comparator;

public class BubbleSortImple <T> implements Sorter <T>{
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        T aux;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length-1; j++){
                if(0 < c.compare(arr[j],arr[j+1])){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=aux;
                }
            }
        }
    }
}
