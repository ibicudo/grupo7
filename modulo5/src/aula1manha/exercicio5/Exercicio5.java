package modulo5.src.aula1manha.exercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        int found = 0;
        int number = (int) Math.pow(10, m-1);

        while(found<n){
            int numD = 0;
            int auxNumber = number;
            while(auxNumber != 0) {
                if(auxNumber%10 == d){
                    numD++;
                }
                auxNumber = auxNumber/10;
            }
            if(numD >= m){
                found++;
                System.out.println(number);
            }
            number++;
        }
        scanner.close();
    }
}
