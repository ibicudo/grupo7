package modulo5.src.aula1tarde.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        double companyX = 1.13;
        double companyY = 18.4;
        int year = 2021;
        while (companyX <= companyY) {
            System.out.printf("Empresa X - 01/01/%d - Valor da empresa: %.2fm\n", year,companyX);
            System.out.printf("Empresa Y - 01/01/%d - Valor da empresa: %.2fm\n", year,companyY);
            companyX *= 2.48;
            companyY *= 1.32;
            year++;
        }
    }
}
