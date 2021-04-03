package btvn2;

import java.util.Scanner;

public class vd1 {
    public static void main(String[] args) {
        int math;
        int ly;
        int hoa;
        int tong1;
        int tong2;
        int maths;
        int lys;
        int hoas;
        int trungBinh;
        int trungBinh1;

        System.out.println("nhap diem mon toan");
        Scanner scan = new Scanner(System.in);
        maths = scan.nextInt();
        System.out.println("nhap diem mon ly");
        lys = scan.nextInt();
        System.out.println("nhap diem mon hoa");
        hoas = scan.nextInt();

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap diem mon toan");
        math = scanner.nextInt();
        System.out.println("nhap diem mon ly");
        ly = scanner.nextInt();
        System.out.println("nhap diem mon hoa");
        hoa = scanner.nextInt();

        System.out.println("so diem cua n1 la:");
        System.out.println( "math = " + maths);
        System.out.println( "ly = " + lys);
        System.out.println( "hoa = " + hoas);
        System.out.println();
        System.out.println("so diem cua n2 la:");
        System.out.println( "math = " + math);
        System.out.println( "ly = " + ly);
        System.out.println( "hoa = " + hoa);

        tong1 = (maths + lys + hoas);
        System.out.printf("tong diem n1 la: %d", tong1);
        System.out.println();
        trungBinh = tong1 * 100 / 300;
        System.out.println( "trung binh n2 la: " + trungBinh + "%");


        System.out.println();

        tong2 = (math + ly + hoa);
        System.out.printf("tong diem n2 la: %d ", tong2);
        System.out.println();
        trungBinh1 = tong2 * 100 / 300;
//        System.out.printf("trung binh n2 la: %d ",trungBinh1);
        System.out.println( "trung binh n2 la: " + trungBinh1 + "%");


//        System.out.println("diem trung binh n1 nhieu hon n2 ? ");
//        if(trungBinh>trungBinh1) {
//                System.out.println("yes ");
//            }
//        else {
//                System.out.println("no");
//            }
//        System.out.println("diem trung binh n1 it hon n2 ? ");
//        if(trungBinh<trungBinh1) {
//            System.out.println("yes ");
//        }
//        else {
//            System.out.println("no");
//        }
//
        System.out.print("\n diem trung binh n1 nhieu hon n2 ? ");
        System.out.println(trungBinh > trungBinh1 ? "yes":"no");
        System.out.print("\n diem trung binh n1 nhieu hon n2 ? ");
        System.out.println(trungBinh < trungBinh1 ? "yes":"no");
        System.out.print("\n diem trung binh n1 nhieu hon n2 ? ");
        System.out.println(trungBinh == trungBinh1 ? "yes":"no");

        System.out.print("\n hoc bong cua n1 la = $");
        System.out.println(trungBinh > 75 ?2000 :(trungBinh>=60 && trungBinh <= 75 ) ?1000 : 0);
        System.out.print("\n hoc bong cua n2 la = $");
        System.out.println(trungBinh1 > 75 ?2000 :(trungBinh1>=60 && trungBinh1 <= 75 ) ?1000 : 0);
    }
}

