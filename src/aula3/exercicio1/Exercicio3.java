package aula3.exercicio1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");

        int n = scanner.nextInt();

        for (int i = 2; i < n / 2; i++) {

            if (n % i == 0) {
                System.out.println("número não é primo");
                return;
            }
        }

        System.out.println("Numero é primo");
    }
}
