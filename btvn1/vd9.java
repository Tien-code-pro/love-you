package btvn1;
import java.util.Scanner;
public class vd9 {




        public static void main(String[] args) {
            double length;
            double width;
            double area;
            double perimeter;
            System.out.println("Enter length:");
            Scanner scanner = new Scanner(System.in);
            length = scanner.nextDouble();
            System.out.println("Enter width:");
            width = scanner.nextDouble();
            area = (length + width) * 2;
            perimeter = width * length;
            System.out.printf("The area is: %f",area);
            System.out.printf("\nThe perimeter: %f",perimeter);
        }
    }

