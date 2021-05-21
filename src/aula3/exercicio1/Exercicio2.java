package aula3.exercicio1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros:");
        int n = scanner.nextInt();

        System.out.println("Informe um valor para verificar seus multiplos:");
        int m = scanner.nextInt();

        for (int i = 1; i < n + 1; i++) {

            System.out.println(i * m);
        }
    }
}
