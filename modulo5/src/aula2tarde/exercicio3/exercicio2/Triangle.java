package modulo5.src.aula2tarde.exercicio3.exercicio2;

public class Triangle extends GeometricFigure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle with base = " + this.base + " and height = " + this.height;
    }
}
