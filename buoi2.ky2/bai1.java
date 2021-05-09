package buoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n,j=0, sum = 0, tempSort;
        float a= 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("how many day temperatures ? ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

//        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("day " + i + " high temp: ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
//        System.out.println("\nMảng ban đầu: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + "\t");
//        }

        // tính tổng các phần tử có trong mảng
        for (int i = 0; i < n; i++) {
            sum += array[i];
            a =sum / n;
        }

        System.out.println("\n trung binh nhiet do cua cac ngay la :"+ a);

        for (int i = 0; i < n; i++){
            if (array[i] >= a){
                j = j +1;
            }
        }
        System.out.println( j + " day above average");


        // sắp xếp theo thứ tự giảm dần
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j <= n - 1; j++) {
//                if (array[i] < array[j]) {
//                    tempSort = array[i];
//                    array[i] = array[j];
//                    array[j] = tempSort;
//                }
//            }
//        }
//        System.out.println("Mảng sau khi sắp xếp là: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[i] + "\t");
//        }

        // tìm phần tử nhỏ nhất
        // sau khi sắp xếp theo thứ tự giảm dần
        // thì phần tử nhỏ nhất là phần tử cuối cùng trong mảng
//        System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);
    }
}
