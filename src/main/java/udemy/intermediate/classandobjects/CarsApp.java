package udemy.intermediate.classandobjects;

public class CarsApp {
    public static void main(String[] args) {

       DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short)392, (short)492, (short)6700, (short)30000, 1000, true );
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

        System.out.println("--------------------------------");
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true );
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();

    }


}
