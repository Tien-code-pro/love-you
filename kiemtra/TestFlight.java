package kiemtra;

public class TestFlight {
    public static void main(String[] args) {
        Flight F = new Flight(875,"Toronto");
        F.display();
        System.out.println("The number is : " + F.number);
        System.out.println("The destination is "+ F.destination);
    }
}