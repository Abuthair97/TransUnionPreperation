package Polymorphism.methodOverriding;

public class rectangle extends  Shape{
    private float length;
    private float width;

    public rectangle(float length,float width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}

