package udemy.beginner;

import java.util.Scanner;

public class WhoWantsToBeAMillionaireApp {
    public static void main(String[] args) {
        boolean theRightAnswer = true;
        Character myAnswer = 'D';

        System.out.println("Who is named as the father of the light bulb, Type A, B, C or D");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //System.out.println("C, Thomas Edison");

        if (input.equals("a")){
            System.out.println("Wrong answer, Nicolas Tesla is not named as the father of the light bulb");
        } else if (input.equals("b")) {
            System.out.println("Wrong answer, Marie Curie is not named as the father of the light bulb");
        } else if (input.equals("c")) {
            System.out.println("Correct answer, Thomas Edison is not named as the father of the light bulb");
        } else {
            System.out.println("Wrong answer, Robert Oppenmeier is not named as the father of the light bulb");
        }

    }
}
