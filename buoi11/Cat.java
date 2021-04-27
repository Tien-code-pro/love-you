package buoi11;

import java.util.Scanner;

public class Cat {
    static String name;
    static int speed;


    private void eat(Rat food){

    }

    public static void Catch(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap ten cat  ");
        name = scan.nextLine();

    }
    public static void  run(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap toc do chay cua cat ");
        speed = scan.nextInt();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }



    @Override
    public String toString() {
        return "Cat " + "name: " + name + '\'' +
                "Cat "+ "speed: " + speed +
                '}';
    }
}
