package modulo5.src.aula2tarde.exercicio3.exercicio1;

public class MediumPassword extends Password {
    public MediumPassword() {
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,12}$");
    }

    @Override
    public void setValue(String value) throws Exception {
        try {
            super.setValue(value);
        } catch (Exception e) {
            throw new Exception("Password should be medium");
        }
    }
}
