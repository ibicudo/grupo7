package modulo5.src.aula3manha.ton.exercicio2;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Integer [] numbers ={3,5,2,1};
        QuickSorterImple <Integer> quick= new QuickSorterImple<>();
        Comparator<Integer> c=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1-o2;
            }
        };
        quick.sort(numbers,c);
        System.out.println("Ordenando pelo quickSort: " +Arrays.toString(numbers));

        Integer [] numbersHeap ={4,6,9,8};
       //HeapSorterImple <Integer> heap= new HeapSorterImple<>();
        //heap.sort(numbersHeap,c);
        System.out.println("Ordenando pelo heapSort: " +Arrays.toString(numbersHeap));

        Integer [] numbersBubble ={3,6,9,8};
        BubbleSortImple <Integer> bubble= new BubbleSortImple<>();
        //bubble.sort(numbersBubble,c);
        //System.out.println("Ordenando pelo bubbeSort: " +Arrays.toString(numbersBubble));

        Sorter<Integer> s = MyFactory.getInstance("sorter");
        s.sort(numbersBubble, c);
        System.out.println(Arrays.toString(numbersBubble));


        //Exercicio 13
        Integer [] mat= new Integer[5000];

        for(int i=mat.length-1; i>=0; i--){
            mat[i]=i;
        }

        Time t = new Time();
        t.start();
        s.sort(mat,c);
        t.stop();
        System.out.println("Tempo para ordenar vetor de integers: " +t.getTime());


    }
}
