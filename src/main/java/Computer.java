public class Computer {
    int RAM;
    String GPU;
    String hardDisk;
    String motherBoard;
    String processor;

    void showInfo() {
        System.out.println("This computer has: " + RAM + " this amount of RAM, and has the following processor: " + processor);
    }

    String showSpecs() {
        return "This computer has: " + RAM + " this amount of RAM, and has the following processor: " + processor;
    }

    int addition(int firstNumber, int secondNumber, String resultString) {
        int result = firstNumber + secondNumber;
        System.out.println(resultString + result);
        return result;
    }
}