package modulo5.src.aula3manha.ton.exercicio2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
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
        HeapSorterImple <Integer> heap= new HeapSorterImple<>();
        heap.sort(numbersHeap,c);
        System.out.println("Ordenando pelo heapSort: " +Arrays.toString(numbersHeap));
    }
}
