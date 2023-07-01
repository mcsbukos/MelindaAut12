package udemy.beginner;

public class ControlFlowApp {
    public static void main(String[] args) {
        boolean isDamaged = false;
        String carColor = "purple";
        char energyEfficiencyCategory = 'Z';

        if (isDamaged) {
            System.out.println("Damaged Car");
        } else {
            System.out.println("Accident free car");
        }

        if (carColor.equals("red")) {
            System.out.println("This car is red");
        } else if (carColor.equals("green")) {
            System.out.println("This car is green");
        } else if (carColor.equals("blue")) {
            System.out.println("This car is blue");
        } else {
            System.out.println("I have no idea what is the color the car");
        }

        switch (energyEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("low energy consumption");
                break;
            case 'G':
                System.out.println("very high energy consumption");
                break;
            default:
                System.out.println("not defined category");
        }


        {
            int numbersOfOwners = 5;
            {
                numbersOfOwners++;
            }
            System.out.println("Numbers of owners: " + numbersOfOwners);
        }

    }
}
