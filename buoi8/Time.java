package buoi8;

import java.util.Scanner;

public class Time {
    public Time(byte hours,byte minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public Time(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter departure Time(hh mm):");
        this.hours = scanner.nextByte();
        this.minutes = scanner.nextByte();

    }
    byte hours;
    byte minutes;

    public byte getHours() {
        return hours;
    }

    public byte getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
