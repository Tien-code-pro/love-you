package btvn1;
import java.util.Scanner;
public class vd3 {

        public static void main(String[] args) {
            double match;
            double ly;
            double hoa;
            double medium;
            System.out.println("Enter Mark match:");
            Scanner scan = new Scanner(System.in);
            match = scan.nextDouble();
            System.out.println("Enter Mark ly");
            ly = scan.nextDouble();
            System.out.println("Enter Mark Hoa");
            hoa = scan.nextDouble();
            medium = (match+ly+hoa)/3;
            if (medium>=8){
                System.out.println("Ban loai gioi");
            }
            else if(medium <= 7){
                System.out.println("Ban loai kha");
            }
            else if(medium<5){
                System.out.println("Ban loai trung binh");
            }
            else{
                System.out.println("Bo hoc di");
            }
            //run
            System.out.printf("The medium score: %.5f",medium);


        }
    }

