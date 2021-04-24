package btvn6;

public class Rectangle extends Shape {

    float perimetter;
    float length=10;
    @Override
    void calculate (float width){
        perimetter=2*(length+width);
        System.out.println("Perimeter of the Rectangle is:"+perimetter);
    }
}
