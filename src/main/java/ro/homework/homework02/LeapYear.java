package ro.homework.homework02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Please give a year between 1900-2016, then press Enter");
        Scanner scanner = new Scanner(System.in);
        Integer year = scanner.nextInt();
        if (year < 1900 && year > 2016){
            System.out.println("You have entereda a wrong year! Please give a year between 1900-2016, then press Enter");
            } else {
            int n = year % 100;
            int m = year % 4;
            int o = year % 400;

            if (n != 0 && m == 0 && o != 0 && n == 0) {
                System.out.println("The number of days in month February from, " + year + ", is: 28 ");
            } else {
                System.out.println("The number of days in month February from, " + year + ", is: 29 ");
            }
        }
    }
}
