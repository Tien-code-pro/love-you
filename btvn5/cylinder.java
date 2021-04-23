package btvn5;

public class cylinder extends circle {
    private double height;
    public cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "Cylinder[height="+ height+","+super.toString()+"]";
    }


    public static void main(String[] args) {
        circle c1 = new cylinder(1.1,2.2);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getArea());
    }
}
