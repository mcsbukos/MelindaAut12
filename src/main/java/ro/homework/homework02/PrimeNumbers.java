package ro.homework.homework02;

public class PrimeNumbers {
    public static void main(String[] args){
        System.out.println("the prime numbers are: ");
        int i;
        int j;
        boolean isPrimeNumber;

        for (i = 2; i < 1000000; i++){
            isPrimeNumber = true;
            for (j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    }
            }

            if (isPrimeNumber) {
                System.out.println(i);
            }

        }

    }
}
