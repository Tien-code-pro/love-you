package buoi8;

import java.time.MonthDay;
import java.util.Scanner;


public class TicketTest {

        void chon(){
        float ques ;

        System.out.println("Enter the type of cabin:");

            System.out.println(1+".Business");
            System.out.println(2+".First");
            System.out.println(3+".Economy");
            Scanner scan = new Scanner(System.in);
            ques = scan.nextInt();
            if ( ques == 1){
                System.out.println("Type of cabin: Business class");
            }
            else if (ques == 2){
                System.out.println("Type of cabin:  First class");
            }else {
            System.out.println("Type of cabin: Economy class");
            }
    }


    void tickets(){
           float quest;
        System.out.println("Enter the number of tickets: ");
        Scanner scanner = new Scanner(System.in);
        quest = scanner.nextInt();

    }

    public static void main(String[] args) {

        Date date = new Date();
//        System.out.println("Enter departure date(mm dd yyyy):");
//        date.getMonth();
//        date.getDay();
//        date.getYear();
//
        Time time = new Time();
//        System.out.println("Enter departure Time(hh mm):");
//        time.getHours();
//        time.getMinutes();

        TicketTest show = new TicketTest();
        show.chon();
        show.tickets();
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Departure Date: " + date);
        System.out.println("Departure "+"session03"+".Time:"+time);
        System.out.println("Number of tickets: ");
        System.out.println("Type of cabin:" +"class");
        System.out.println("Total cost of the ticket: ");




        }


}


