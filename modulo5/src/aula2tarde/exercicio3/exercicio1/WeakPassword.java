package modulo5.src.aula2tarde.exercicio3.exercicio1;

public class WeakPassword extends Password {
    public WeakPassword() {
        super(".*");
    }

    @Override
    public void setValue(String value) throws Exception {
        try {
            super.setValue(value);
        } catch (Exception e) {
            throw new Exception("Password should be weak");
        }
    }
}
