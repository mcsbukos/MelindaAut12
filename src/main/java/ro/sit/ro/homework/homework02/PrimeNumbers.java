package ro.sit.ro.homework.homework02;

public class PrimeNumbers {
    public static void main(String[] args){
        System.out.println("the prime numbers are: ");
        int number;
        int divisor;
        boolean isPrime;

        for (number = 2; number < 1000000; number ++){
            isPrime = true;
            for (divisor = 2; divisor*divisor <= number; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }

        }

    }
}
