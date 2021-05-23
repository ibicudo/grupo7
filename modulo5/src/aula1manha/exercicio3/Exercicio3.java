package modulo5.src.aula1manha.exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Informe um número:");

            int n = scanner.nextInt();

            for (int i = 2; i < n / 2; i++) {

                if (n % i == 0) {
                    System.out.println("número não é primo");
                    return;
                }
            }
        }finally{
            scanner.close();
        }
        System.out.println("Numero é primo");

    }
}
