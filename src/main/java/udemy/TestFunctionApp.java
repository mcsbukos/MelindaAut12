package udemy;

public class TestFunctionApp {
    public static void main(String[] args) {
    getSayHello();
    blackboardPunishment(5);
    System.out.println(getTenPercentOff(2000));
    System.out.println(getTenPercentOff(2000, 50));
    }

    static void getSayHello() {
        System.out.println("Hello");;
    }

    static void blackboardPunishment(int repeatNumber){
        for (int i = 1; i <= repeatNumber; i++) {
            System.out.println("Being right sucks");
        }
    }

    static double getTenPercentOff(int price){
            return price * 0.9;
    }

    static double getTenPercentOff(int price, int percent){
        return price * percent /100;
    }


}
