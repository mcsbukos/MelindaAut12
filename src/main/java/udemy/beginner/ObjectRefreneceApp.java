package udemy.beginner;

public class ObjectRefreneceApp {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 24566L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.25648;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carType = "Type";
        String carModelNew = new String("DodgeChallenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats.floatValue());
        System.out.println("Horspower : " + horsePower.floatValue());
        System.out.println("Price:  $ : " + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Combined Fuel Consumption: " + fuelConsumptionCombined);
        System.out.println("Precise Fuel Consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("Combined Fuel Consumption: " + fuelConsumptionCombined.intValue());
        System.out.println("Car model: " + carModel);
        System.out.println("Car model in Upper case: " + carModel.toUpperCase());
        System.out.println("Car model in lower case: " + carModel.toLowerCase());
        System.out.println("Car Type is: " + carType.toUpperCase());

        System.out.println(true);
    }
}
