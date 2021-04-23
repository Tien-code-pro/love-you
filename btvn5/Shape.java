package btvn5;

public class Shape {
    private String color;
    public Shape(String color){
        this.color= color;
    }
    @Override
    public String toString(){
        return "Shape[color="+ color+"]0";
    }
    public double getArea(){
        System.out.println("Shape unknown! can not compute area!");
        return 0;
    }
}
