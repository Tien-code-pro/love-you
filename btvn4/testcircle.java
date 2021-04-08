package btvn4;

public class testcircle {
    public static void main(String[] args) {
        circle c1 = new circle(2.0,"blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("the area is: %.2f%n",c1.getArea());

        circle c2 = new circle(2.0);
        System.out.println("The radius is: "+c2.getRadius());
        System.out.println("The color is: "+c2.getColor());
        System.out.printf("the area is: %.2f%n",c2.getArea());

        circle c3 = new circle();
        System.out.println("The radius is: "+c3.getRadius());
        System.out.println("The color is: "+c3.getColor());
        System.out.printf("the area is: %.2f%n",c3.getArea());
    }
}
