package Encapsulation.Car;

public class CarMain {
    public static void main(String[] args) {

        Car car =  new Car();
        car.setCarName("Tesla");
        car.setCarYear(2023);

        System.out.println("Car name is : " +car.getCarName());
        System.out.println("Car Year is : "+car.getCarYear());
    }
}
