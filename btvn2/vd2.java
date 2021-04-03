package btvn2;

import java.util.Scanner;

public class vd2 {
    public static void main(String[] args) {
        int   quantity;
        int   quantity2;
        int priceSir = 300;
        int totalSir;
        int totalTr;
        int priceTrop = 700;
        float netTotal;
        int total;
        float fointsEarned;


        Scanner scan = new Scanner(System.in);
        System.out.println("nhap so long san pham thu nhat");
        quantity = scan.nextInt();
        scan.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so long san pham thu hai");
        quantity2 = scanner.nextInt();

        totalSir = (quantity * priceSir);
        totalTr =(quantity2 * priceTrop);
        total = totalSir + totalTr;
        int discount;
        discount = total /10;
        if (total>3000){
            netTotal = total - discount;
        }
        else {
            discount=0;
            netTotal = total;
        }

        System.out.println("Item          Quantity       price         total\n");
        System.out.println("-----------------------------------------------------\n");
        System.out.printf("SP1                %d           300          %d \n",quantity,totalSir);
        System.out.printf("SP2                %d           700          %d \n",quantity2,totalTr);
        System.out.println("Discount                                     "+ discount );
        System.out.println("-----------------------------------------------------");
        System.out.println("Net Total                                     "+ netTotal);
        System.out.println("----------------------------------------------------");
        fointsEarned = netTotal/100;
        System.out.println("Points Earned          " +fointsEarned);
        System.out.println("Thank you!");
    }
}
