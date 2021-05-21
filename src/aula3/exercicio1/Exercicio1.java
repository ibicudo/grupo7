package aula3.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i * 2);
        }
    }
}
