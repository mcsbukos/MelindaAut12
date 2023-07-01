package udemy.beginner;

public class PracticemethodApp {
    public static void main(String[] args) {
        System.out.println(getEnergyEfficiency('g'));
        getcarDescription("Peugeot", 2018, "used");
    }
public static String getEnergyEfficiency(char category){
        switch (category) {
            case 'a':
            case 'A':
                return "This is a very low consumption";
            case 'b':
            case 'B':
               return "This is a low consumption";
            case 'c':
            case 'C':
                return "This is a normal consumption";
            case 'd':
            case 'D':
                return "This is an above normal consumption";
            case 'e':
            case 'E':
                return "This is a high consumption";
            case 'f':
            case 'F':
                return "This is a very high consumption";
            case 'g':
            case 'G':
                return "This is an extremely high consumption";
            default:
               return "This consumption is not defined";

    }
}

public static void getcarDescription(String model, int productionYear, String condition){
    System.out.println(" the car model is: " + model);
    System.out.println(" the priduction year: " + productionYear);
    System.out.println("the car's conditionis: " + condition);
}


}
