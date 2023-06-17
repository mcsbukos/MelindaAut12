package ro.sit.ro.course.Course03;

public class Shapes {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSquareSide(Double.parseDouble(args[0]));
        System.out.println(square.getArea());
        System.out.println();

        for(String argument : args) {
            Square currentSquare = new Square();
            currentSquare.setSquareSide(Double.parseDouble(argument));
            System.out.println(square.getArea());
        }

    }

}