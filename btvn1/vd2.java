package btvn1;
import java.util.Scanner;
public class vd2 {

        public static void main(String[] args) {
            int accountNumber;
            double accountBalance;
            //Initializing the variables
            System.out.println("Enter the details for the new Account to be created...");
            System.out.println("Enter the Account Number");
            Scanner scan = new Scanner(System.in);
            accountNumber = scan.nextInt();
            System.out.println("Enter the Account Balance");
            accountBalance = scan.nextDouble();
            //Display the values of the variables.R
            System.out.println("The details of the new account are:");
            System.out.printf("Account Number: %d", accountNumber);
            System.out.printf("\nAccount Balances: $%.2f", accountBalance);
        }
    }

