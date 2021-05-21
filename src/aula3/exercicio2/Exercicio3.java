package aula3.exercicio2;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> products = new HashMap<>();
        HashMap<Integer, Double> prices = new HashMap<>();
        HashMap<Integer, Integer> quantitys = new HashMap<>();


        double total = 0;

        for (int i = 1; i < 4; i++) {
            products.put(i, scanner.next());
            prices.put(i, scanner.nextDouble());
            quantitys.put(i, scanner.nextInt());
            total += prices.get(i) * quantitys.get(i);
        }
        for (int i = 1; i < 4; i++) {
            System.out.println("Produto " + i);
            System.out.println(products.get(i));
            System.out.println("R$" + prices.get(i));
            System.out.println("Quantidade: " + quantitys.get(i));
            System.out.println();
        }

        System.out.println("Valor Total: R$" + total);
    }
}
