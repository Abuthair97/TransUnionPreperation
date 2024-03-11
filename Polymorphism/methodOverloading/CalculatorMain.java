package Polymorphism.methodOverloading;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator  calculator = new Calculator();
       System.out.println("Adding 2 float "+ calculator.add(2.3F,3.2F));
       System.out.println("Adding 2 int "+ calculator.add( 1,2));
       System.out.println("Adding 2 String "+calculator.add("Hello "," world"));
    }

}
