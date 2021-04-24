package btvn6;

public class Circle extends Shape{
    float area;
    @Override
    void calculate(float rad){
        area=getPI()*rad*rad;
        System.out.println("Area of Circle is:"+area);
    }


}