package buoi8;

import java.util.Scanner;

public class Date {

    byte day;
    byte month;
    short year;
    public Date(byte month,byte day,short year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter departure date(mm dd yyyy):");
        this.day = scanner.nextByte();
        this. month= scanner.nextByte();
        this.year = scanner.nextShort();
    }
    public byte getDay() {
        return day;
    }

    public byte getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
