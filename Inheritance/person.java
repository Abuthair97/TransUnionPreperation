package Inheritance;

public class person {
    protected String name;
    protected int age;

    public person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void eat(){
        System.out.println(name +" is eating.... ");
    }
    public void sleep(){
        System.out.println(name +" is sleeping.... ");
    }
}
