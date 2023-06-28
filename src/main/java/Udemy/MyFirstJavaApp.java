package Udemy;



public class MyFirstJavaApp {
    public static void main (String[] args){
    byte numberOfSeats = 5;
    byte numberOfDoors = 3;
    byte numberOfVehicleOwners = 1;
    byte emissionSticker = 4;
    short power = 362;
    short horsePower = 492;
    short co2Emission = 333;
    short cubicCapacity = 6417;

    int price = 29999;
    int mileage = 14999;

    long registrationNumber = 1346464313L;

    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;
    float fuelConsumptionExtraUrban = 13.6F;

    double fuelConsumptionPreciseAverage = 152.3456789123e-1;
    boolean isDamaged = true;
    char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: €" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity);
        System.out.println("Power: " + power + "kW(" + horsePower + "hp)");
        System.out.println("CO2 emission: " + co2Emission + "g/km");
        System.out.println("Emission sticker: " + emissionSticker + " ( Energy efficiency: " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + "l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + "l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km");
        System.out.println("Precise combined fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The value of new number of seats: " + newNumberOfSeats);
        double newFuelConsuptionCombined = fuelConsumptionCombined;
        System.out.println("The value of new fule consumption combined " + newFuelConsuptionCombined + "l/100 km");

        int newCubicCapacity = (int) cubicCapacity;
        System.out.println("The new cubic Capacity is: " + newCubicCapacity);

        byte newPower = (byte) power;
        System.out.println("New value of power: " + newPower + "kW");

        byte newMileage = (byte) mileage;
        System.out.println("The new milaege is: " + newMileage);




}
}
