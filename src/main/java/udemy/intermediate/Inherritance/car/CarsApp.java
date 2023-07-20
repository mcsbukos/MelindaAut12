package udemy.intermediate.Inherritance.car;

public class CarsApp {
    public static void main(String[] args) {

       DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short)392, (short)492, (short)6700, (short)30000, 1000, true );
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

        System.out.println("--------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)225, (short)492, (short)3500, (short)30000, 1000, false);
        blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();
    }


}
