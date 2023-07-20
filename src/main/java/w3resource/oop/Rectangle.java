package w3resource.oop;

public class Rectangle {
    int length;
    int width;
    int area;
    int perimeter;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
    public int getArea(){
        return area = width * length;
    }
    public int getPerimeter(){
        return perimeter = 2 * (width + length);
    }
}
