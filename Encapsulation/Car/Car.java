package Encapsulation.Car;
/*
* Encapsulation:Encapsulation is the concept of bundling the data (attributes) and the
* methods (functions) that operate on the data into a single unit, known as a class. It hides the
* internal details of an object and protects the data from unauthorized access
*
*/
public class Car {

    private String carName;
    private int   carYear;

    //Constructor
    public Car(String carName , int carYear){
        this.carName = carName;
        this.carYear = carYear;
    }

    public Car() {

    }

    //Getter
    public String getCarName() {
        return carName;
    }
    //Setter

    public void setCarName(String carName) {
        this.carName = carName;
    }

    //Getter
    public int getCarYear(){
        return carYear;
    }
    //Setter
    public int setCarYear(int carYear){
        return carYear;
    }
}
