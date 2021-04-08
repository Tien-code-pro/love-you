package btvn4;

public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println("the circle has radius of "+ c1.getRadius() +" and area of "+ c1.getArea());

        Circle2 c2 = new Circle2(2.0);
        System.out.println("the circle has radius of "+ c2.getRadius() +" and area of "+ c2.getArea());

    }
}
