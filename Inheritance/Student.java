package Inheritance;

public class Student  extends person{
    private String studentId;
    public Student(String name, int age,String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void study(){
        System.out.println( name+"is studing .... ");
    }
}
