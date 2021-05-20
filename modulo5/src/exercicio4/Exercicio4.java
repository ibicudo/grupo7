package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número:");

        int n = scanner.nextInt();

        int numeros = 0;
        int i = 2;

        while (numeros < n) {

            boolean verificandoPrimo = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    verificandoPrimo = false;
                    break;
                }

            }

            if (verificandoPrimo) {
                System.out.println(i);
                numeros++;
            }

            i++;
        }
    }
}
