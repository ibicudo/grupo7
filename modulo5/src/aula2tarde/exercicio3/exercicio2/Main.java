package modulo5.src.aula2tarde.exercicio3.exercicio2;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 2);
        Triangle triangle = new Triangle(10, 2);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(triangle);

        System.out.printf("%.2f%n", circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());
    }
}
