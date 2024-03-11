package Inheritance;

public class main {
    public static void main(String[] args) {

        Student student = new Student("Abu" , 21,"S234A");
        student.study();
        student.eat();
        student.eat();

        teacher teacher = new teacher("Abuthair",22,"Maths");
        teacher.teach();
        teacher.eat();
        teacher.sleep();

    }
}
