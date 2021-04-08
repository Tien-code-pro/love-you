package btvn4;

public class Circle2 {
    private double radius;
    private  String color;

    public Circle2(){
        radius = 1.0;
        color = "red";
    }
    public Circle2(double r){
        radius = r;
        color = "red";
    }
    public  double getRadius(){
        return radius;
    }
    public  double getArea(){
        return  radius * radius * Math.PI;

    }
    public int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
