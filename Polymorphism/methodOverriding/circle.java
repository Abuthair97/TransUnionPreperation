package Polymorphism.methodOverriding;

public class circle extends Shape{
    public double radius;

    public circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
