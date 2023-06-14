package ro.sit.ro.homework.homework02;

public class PrimeNumbers {
    public static void main(String[] args){
        boolean isPrimitive;
        int divide;
        int modul;
        for (int i=1; i<=10; i++){
            for (int k = 1; k<i; k++) {
                divide = i / k;
                modul = i % k;
                if (modul == 0)   {
                    System.out.println("Primitive numbers are: " + i);
                }
            }
        }

    }
}
