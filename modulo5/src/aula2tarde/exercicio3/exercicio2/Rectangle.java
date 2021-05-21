package modulo5.src.aula2tarde.exercicio3.exercicio2;

public class Rectangle extends GeometricFigure {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
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
        return this.base * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle with base = " + this.base + " and height = " + this.height;
    }
}
