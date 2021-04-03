package btvn2;

import java.util.Scanner;

public class vd5 {
    public static void main(String[] args) {
        System.out.println("|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---");
        System.out.println("|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---");

        System.out.println("cach 2 :))");
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai cua hinh ban muon :");
        m = scanner.nextInt();
        System.out.println("nhap chieu rong cua hinh ban muon :");
        n = scanner.nextInt();

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print("|---");
            }
            System.out.println();
        }
    }
}
