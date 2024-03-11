package Inheritance;

public class teacher  extends person{
    private String subject;
    public teacher(String name, int age,String subject) {
        super(name, age);
        this.subject=subject;
    }
    public void teach(){
        System.out.println(name + " is teaching "+subject);
    }
}
