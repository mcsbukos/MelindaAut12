package udemy.intermediate.Inherritance.car;

import java.util.Random;

public class Car {
   private byte numberOfSeats = 5;
    private byte numberOfDoors = 3;
    private byte numberOfVehicleOwners = 1;
    private byte emissionSticker = 4;
    private short power = 362;
    private short horsePower = 492;
    private short co2Emission = 333;
    private short cubicCapacity = 6417;

    private int price = 29999;
    private int mileage = 14999;

    private long registrationNumber = 1346464313L;

    private float fuelConsumptionCombined = 15.5F;
    private float fuelConsumptionUrban = 21.4F;
    private float fuelConsumptionExtraUrban = 13.6F;

    private double fuelConsumptionPreciseAverage = 152.3456789123e-1;
    private boolean isDamaged = true;
    private char energyEfficiencyCategory = 'G';

    private String color;
    private String carName;

    public Car(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                    int price, int mileage, boolean isDamaged) {
        this.carName = carName;
        this.color = color;
        this.numberOfVehicleOwners = numberOfVehicleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.mileage = mileage;
        this.isDamaged = isDamaged;
        Random randomNumberGenerator = new Random();
        this.registrationNumber = randomNumberGenerator.nextLong();

    }

    public void startTheEngine() {
        System.out.println("The " + color + "colored car's engine is started");
    }


    public void getDescription() {
        System.out.println("A " + color + " " + carName + " is created");
        System.out.println("A " + " Dodge Challenger is created");
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

    }

  }

