package w3resource.inheritance;

public class ShapeApp {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(4, 2);
        shape.getArea();
        rectangle.getArea();

    }
}
