package Udemy;

public class PracticemethodApp {
    public static void main(String[] args) {
        System.out.println(getEnergyEfficiency('b'));
        getCarDescription("Dodge", 2008, "is used");
    }

    static String getEnergyEfficiency(char category) {
        switch (category) {
            case 'A':
            case 'a':
                return "Very low";
            case 'B':
            case 'b':
                return "Low";
            case 'C':
            case 'c':
                return "Normal";
            case 'D':
            case 'd':
                return "Above normal";
            case 'E':
            case 'e':
                return "High";
            case 'F':
            case 'f':
                return "Very high";
            case 'G':
            case 'g':
                return "Extremely high";
            default:
                return "This energy efficiency is not defined";
        }
    }
    static void getCarDescription(String model, int productionYear, String condition) {
            System.out.println("The car model is: " + model);
            System.out.println("The production year is: " + productionYear);
            System.out.println("The car condition is: " + condition);



    }

}
