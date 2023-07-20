package w3resource.Thread;

public class Exercise1 {
    public static void main(String[] args){
        try {
            int i = 10/0;
            System.out.println("The result is :"+i);
        } catch (ArithmeticException e) {
            System.out.println("a Number cannot be divided by 0");
        }

    }
}