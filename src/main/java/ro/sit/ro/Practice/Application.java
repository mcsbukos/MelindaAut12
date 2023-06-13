package ro.sit.ro.Practice;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Please eneert a value from 1 to 7");
       Scanner userInput = new Scanner(System.in);
       int dayOfWeek = userInput.nextInt();

       switch(dayOfWeek) {
           case 1:
               System.out.println("Monday");
               break;
           case 2:
               System.out.println("Tuesday");
               break;
           case 3:
               System.out.println("Wednesday");
               break;
           case 4:
               System.out.println("Thursday");
               break;
           case 5:
               System.out.println("Friday");
               break;
           case 6:
               System.out.println("Saturday");
               break;
           case 7:
               System.out.println("Sunday");
               break;
           default:
               System.out.println("Wrong inut");
       }

    }
}

