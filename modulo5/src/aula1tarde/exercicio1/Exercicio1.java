package modulo5.src.aula1tarde.exercicio1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {

        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Arrays.sort(array);

        for (Integer arrayNum : array) {
            System.out.print(arrayNum + " ");
        }

        List<Integer> arr = Arrays.asList(array);
        Collections.reverse(arr);
        System.out.print('\n' +arr.toString());

    }
}
