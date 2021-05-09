package buoi2;

import java.util.Scanner;

public class bai2 {
        public static void main(String[] args) {
            int n,j=0, sum = 0;
            float a= 0;
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("how many day temperatures ? ");
                n = scanner.nextInt();
            } while (n < 0);

            // khởi tạo và cấp phát bộ nhớ cho mảng
            int array[] = new int[n];

//        System.out.println("Nhập các phần tử cho mảng: ");5
            for (int i = 0; i < n; i++) {
//                System.out.print( i);
                array[i] = scanner.nextInt();
            }

//             Hiển thị mảng vừa nhập
//        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print("day " + i+ " high temp: "+array[i]+"\n");
        }

            // tính tổng các phần tử có trong mảng
            for (int i = 0; i < n; i++) {
                sum += array[i];
                a =sum / n;
            }

            System.out.println("\n trung binh nhiet do cua cac ngay la :"+ a);

}
}
