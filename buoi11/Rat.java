package buoi11;

import java.util.Scanner;

public class Rat {
    static String name;
    static int speed;
    static int weight;


    public static void Catch2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten chuot ");
        name = scan.nextLine();

    }
    public static void run2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap toc do chuot ");
        speed = scan.nextInt();
    }

    public  static  void Weight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap can nang chuot ");
        weight = scanner.nextInt();
    }

    public static void setName(String name) {
        Rat.name = name;
    }

    public static void setSpeed(int speed) {
        Rat.speed = speed;
    }

    public static void setWeight(int weight) {
        Rat.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Rat{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
