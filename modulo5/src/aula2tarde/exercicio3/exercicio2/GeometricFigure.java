package modulo5.src.aula2tarde.exercicio3.exercicio2;

public abstract class GeometricFigure {
    private double area;

    public GeometricFigure() {
    }

    public GeometricFigure(double area) {
        this.area = area;
    }

    public abstract double getArea();
}
