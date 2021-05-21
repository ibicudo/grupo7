package modulo5.src.aula2tarde.exercicio3.exercicio1;

public class Main {
    public static void main(String[] args) {
        StrongPassword strongPassword = new StrongPassword();
        MediumPassword mediumPassword = new MediumPassword();
        WeakPassword weakPassword = new WeakPassword();

        String password = "aA2aaaa!#$";

        try {
            weakPassword.setValue(password);
            mediumPassword.setValue(password);
            strongPassword.setValue(password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("It passes");
    }
}
