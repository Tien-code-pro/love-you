package buoi11;

import java.util.Scanner;

public class MainGame {
    static int ques;
    static int speed;
    static int speed1;
    static int weight;


    public static void run2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap toc do chuot ");
        speed = scan.nextInt();
    }

    public static void  run(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nhap toc do chay cua cat ");
        speed1 = scan.nextInt();
    }

    public  static  void Weight(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap can nang chuot ");
        weight = scanner.nextInt();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cat.Catch();
        Rat.Catch2();
        run2();
        Weight();
        run();




        System.out.println("Meo duoc sinh ra :"+Cat.name);
        System.out.println("chuot duoc sinh ra: "+Rat.name);
        if (speed >= speed1) {
            System.out.println("Meo khong bat duoc chuot !");
            System.out.println("Meo khong bat duoc chuot nen chiu doi");
            System.out.println("Chuot van con, choi tiep!");
            System.out.println("nhan 1 de choi or 2 de ket thuc");
            int ques = scanner.nextInt();
                if (ques == 1){
                    run2();
                    Weight();
                    run();
                    if (speed >= speed1) {
                        System.out.println("Meo van khong bat duoc chuot !");
                        System.out.println("ban da het luot choi =((");
                        System.out.println("con ga!");
                    } else {
                        System.out.println("Meo da tom dc chuot hahaha!");
                        System.out.println("Đa het chuot! Het phim.");
                    }
                }else{
                    System.out.println("thank you!");
                }

        } else {
            System.out.println("Meo da tom dc chuot hahaha!");
            if (weight>= 5){
                System.out.println("Mum mum! chuot beo day!");
            }else {
                System.out.println("Mum mum! chuot hoi gay!");
            }
            System.out.println("Đa het chuot! Het phim.");
        }
    }
}
