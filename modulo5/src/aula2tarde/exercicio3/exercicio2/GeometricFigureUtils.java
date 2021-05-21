package modulo5.src.aula2tarde.exercicio3.exercicio2;

public class GeometricFigureUtils {

    public static double averageArea(GeometricFigure[] figures) {
        double sum = 0;

        for (GeometricFigure figure : figures) {
            sum += figure.getArea();
        }

        return sum / figures.length;
    }
}
