package modulo5.src.aula2tarde.exercicio3.exercicio2;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Circle with radius = " + this.radius;
    }
}
