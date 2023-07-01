package udemy.beginner;

public class FunctionApp {
    public static void main(String[] args) {
        sayHello();
        blackboardPunishment(5);
        System.out.println("The 10 % off price is: " + getTenPercentOffDiscount(20000));
        System.out.println("The 50 % off price is: " + getDiscountPrice(20000, 50));
        System.out.println("The 40 % off price is: " + getDiscountPrice(20000.75, 40));
    }
     static void sayHello(){
         System.out.println("Hello");
     }
     static void blackboardPunishment(int repeatNumber){
         for (int i = 0; i <= repeatNumber; i++) {
             System.out.println("to be right sucks");
         }
     }

     static double getTenPercentOffDiscount(int price){
        return price * 0.9;
     }

     static double getDiscountPrice(int price, int percent){
        return price * 0.9 / 100;
     }

     static double getDiscountPrice(double price, int percent){
        return price * 0.9 / 100;
     }
}
