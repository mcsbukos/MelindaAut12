package ro.homework.homework02;

public class SumOfNumbers {
    public static void main(String[] args){
        int number=0;
        for (int i=1; i<101; i++){
            number = number + i;
        }
        System.out.println("The sum of the first 100 numbers higher than 0 is: " + number);
    }
}
