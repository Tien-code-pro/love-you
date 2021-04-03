package btvn2;

import java.util.Scanner;

public class vd4 {
    public static void main(String[] args) {
        System.out.println("    *    ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");

        System.out.println("tam giac so hoc =))");
        System.out.println("moi ban nhap gia tri vao day :");

        int h;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        int x, output;

        for (int i=1;i<=h;i++){
            for(int j =0; j<= 2*h;j++){
                x = j - h;
                if (x<0){
                    x *= -1;
                }
                output = i - x;

                if (output > 0){
                    System.out.printf("%3d",output);
                }
                else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }

    }
}
