package buoi2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        List<String> phones = new ArrayList<>();

            System.out.println("0 - to shutdown");
            System.out.println("1 - to print contacts");
            System.out.println("2 - to add a new contact");
            System.out.println("3 - to update existing contact");
            System.out.println("4 - to remove an existing contact");
            System.out.println("5 - query if an existing contact exists");
            System.out.println("6 - to print a list of available actions.");
            System.out.println("Choose your action: ");

            Iterator<String> in = phones.iterator();
            while (in.hasNext()){
                String s = in.next();
                System.out.println(s);
        }

        do {
            System.out.println("\nEnter action: (6 to show available actions)");
            i = scan.nextInt();
            switch (i){

                case 2 :
                    int s;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter new contact name : ");
                    String c = sc.nextLine();
                    System.out.println("Enter phone number: ");
                     s = sc.nextInt();
                    System.out.println("new contact added: name = "+c+", phone = "+s);
                    break;

                case 1:
                    System.out.println("contact list");
                    System.out.println();
                    break;


                case 3:
                    int sdt = 0;
                    Scanner scl = new Scanner(System.in);
                    System.out.println("Enter new contact name : ");
                    String n3 = scl.nextLine();
                    System.out.print("Enter new contact name: ");
                    String n4 = scl.nextLine();
                    System.out.print("Enter new contact phone number:");
                    sdt = scl.nextInt();
                    System.out.println(n3 +", was replaced width "+n4 );
                    System.out.println("Successfully update record");
                    break;

                case 4:
                    Scanner nhap = new Scanner(System.in);
                    System.out.println("Enter existing contact name: ");
                    String n = nhap.nextLine();
                    System.out.println( n + ", was delete.");
                    System.out.println("Successfully delete ");
                    break;

                case 5:
                    Scanner in1 = new Scanner(System.in);
                    System.out.println("Enter existing contact name:");
                    String abc = in1.nextLine();
//                    System.out.println(n3 +"name:"+"phone number is: " );
                    System.out.printf("name: %s phone number is: %d");
                    break;

                case 6:
                    System.out.println("0 - to shutdown");
                    System.out.println("1 - to print contacts");
                    System.out.println("2 - to add a new contact");
                    System.out.println("3 - to update existing contact");
                    System.out.println("4 - to remove an existing contact");
                    System.out.println("5 - query if an existing contact exists");
                    System.out.println("6 - to print a list of available actions.");
                    System.out.println("Choose your action: ");

            }
        }while (i > 0);
        System.out.println("shutdown.......");
    }
}
