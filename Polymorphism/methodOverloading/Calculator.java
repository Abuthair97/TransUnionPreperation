package Polymorphism.methodOverloading;



//Method Overloading
public class Calculator {

    public int add(int a,int b){
        return (a+b);
    }
    public float add(float a, float b){
        return (a+b);
    }
    public String add(String str1,String str2) {
        return str1 + str2;
    }


}
