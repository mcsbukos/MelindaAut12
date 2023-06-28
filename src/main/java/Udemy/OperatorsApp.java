package Udemy;

public class OperatorsApp {
    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = false;

        System.out.println("Price af a " + carModel + " : $" + price);

        int increasedPrice = price + 1000;
        System.out.println("The increased price af a " + carModel + " : $" + increasedPrice);
        int decreasedPrice = price - 1000;
        System.out.println("The decreased price af a " + carModel + " : $" + decreasedPrice);
        int twoCarsPrice = price *2;
        System.out.println("Two " + carModel + " : $" + twoCarsPrice);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("From the money we have in the bank we can buy "  + dodgesYouCanBuy + " " + carModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.println("Money we would remain after buying "+ dodgesYouCanBuy + " " + carModel + ": $ " + moneyRemaining );

        System.out.println();
       int priceNegative = -14999;
       int priceNegativeWithPlusSign = + priceNegative;
       System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);
       int priceNegativeWithMinusSign = - priceNegative;
       System.out.println("Negative price with minus sign: $" + priceNegativeWithMinusSign);

       int priceOneEuroIncrease = ++price;
       System.out.println("Price after one euro priceing increase: $"+ priceOneEuroIncrease);
       int priceOneEuroDecrease = --price;
       System.out.println("Price after one euro priceing decrease: $"+ priceOneEuroDecrease);
       System.out.println("This car is damaged: " + !isDamaged);
       System.out.println();

        System.out.println("Car's price equals the money in the bank:" + (price == moneyInTheBank));
        System.out.println("Car's price doesn't equals the money in the bank:" + (price != moneyInTheBank));
        System.out.println("Car's price is greater than the money in the bank:" + (price > moneyInTheBank));
        System.out.println("Car's price is less than the money in the bank:" + (price < moneyInTheBank));
        System.out.println("Car's price is greater or equals than the money in the bank:" + (price >= moneyInTheBank));
        System.out.println("Car's price is less or equals than the money in the bank:" + (price <= moneyInTheBank));
        System.out.println("the carModel variable's dtattipe is a string: " + (carModel instanceof String));

        System.out.println();
        String damagedText = isDamaged ? "This car is damaged" : "This car is not damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <= 20000 ? "It is worth seeing the car" : "It is not worth seeing the car";
        System.out.println(worthSeeingText);

        String worthRepairingText = isDamaged && price <= 10000 ? "It is worth repairing the car" : "It is not worth repairing the car";
        System.out.println(worthRepairingText);
        System.out.println();

        price += 1000;
        System.out.println("Price increased: $" + price);
        price -= 2000;
        System.out.println("Price decreased: $" + price);
        price *= 2;
        System.out.println("Price multipled: $" + price);
        price /= 2;
        System.out.println("Price devided: $" + price);
        price %= 10000;
        System.out.println("Price remained: $" + price);

    }
}
