public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.GPU = "NVIDIA";
        computer1.hardDisk = "WD";
        computer1.RAM = 1024;
        computer1.motherBoard = "random name";
        computer1.processor = "Intel";

        String returnValue = computer1.showSpecs();
       // System.out.println(returnValue);

        computer1.addition(3, 4, "Result is: ");
    }
}