package modulo5.src.aula2manha.exercicio5;

public class Main {
    public static void main(String[] args) {
        Data today = new Data(21, 5, 2021);
        System.out.println(today);

        today.addDay();
        System.out.println(today);

        Data wrongDate = new Data(50, 2, 23);
        System.out.println(wrongDate.IsCorret());


    }
}
