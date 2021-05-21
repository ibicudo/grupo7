package modulo5.src.aula2tarde.exercicio3.exercicio1;

public class StrongPassword extends Password {
    public StrongPassword() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
    }

    @Override
    public void setValue(String value) throws Exception {
        try {
            super.setValue(value);
        } catch (Exception e) {
            throw new Exception("Password should be strong");
        }
    }
}
