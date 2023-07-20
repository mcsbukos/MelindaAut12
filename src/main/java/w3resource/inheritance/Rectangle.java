package w3resource.inheritance;

public class Rectangle extends Shape{
 private int length;
 private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void getArea(){
            int area = width * length;
            System.out.println("The second area is: " + area);
        }
    }
