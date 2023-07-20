package w3resource.Thread;

public class Exercise2 {
    public static void main(String[] args) {

        try {
            int result = divideNumbers(5, 0);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int divideNumbers(int dividend, int divisor ){
        if (divisor == 0) {
            throw new ArithmeticException("A number cannot be divided by 0");
        } else {
            return dividend/divisor;
        }
    }
}