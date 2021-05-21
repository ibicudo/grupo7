package modulo5.src.aula2tarde.exercicio3.exercicio1;

import java.util.regex.Pattern;

public class Password {
    private String pattern;
    private String value;

    public Password(String pattern) {
        this.pattern = pattern;
    }

    public void setValue(String value) throws Exception {
        if (Pattern.compile(this.pattern).matcher(value).matches()) {
            this.value = value;
        } else {
            throw new Exception("Password does not match pattern");
        }
    }
}
