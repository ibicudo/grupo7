package modulo5.src.aula3manha.exercicio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MyFactory {
    public static Sorter getInstance (String objName) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Properties properties =  new Properties();
        FileInputStream file = new FileInputStream("modulo5/src/aula3manha/exercicio2/MyFactory.properties");
        properties.load(file);

        return (Sorter) Class.forName(properties.get(objName).toString()).getConstructor().newInstance();

    }
}
