package w3resource.oop;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(7, 12);

        System.out.println("The area for a " + rectangle1.getLength() + " long " + rectangle1.getWidth() + " wide rectangle is: " + rectangle1.getArea());
        System.out.println("The perimeter for a " + rectangle1.getLength() + " long " + rectangle1.getWidth() + " wide rectangle is: " + rectangle1.getPerimeter());

        System.out.println("The area for a " + rectangle2.getLength() + " long " + rectangle2.getWidth() + " wide rectangle is: " + rectangle2.getArea());
        System.out.println("The perimeter for a " + rectangle2.getLength() + " long " + rectangle2.getWidth() + " wide rectangle is: " + rectangle2.getPerimeter());

        rectangle2.setLength(6);
        rectangle2.setWidth(12);
        System.out.println("The area for a " + rectangle2.getLength() + " long " + rectangle2.getWidth() + " wide rectangle is: " + rectangle2.getArea());
        System.out.println("The perimeter for a " + rectangle2.getLength() + " long " + rectangle2.getWidth() + " wide rectangle is: " + rectangle2.getPerimeter());

    }
}
