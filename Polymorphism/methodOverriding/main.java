package Polymorphism.methodOverriding;

public class main {
    public static void main(String[] args) {
        Shape circle = new circle(5D);
        Shape rectangle = new rectangle(4,4);

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}
