package ro.sit.ro.course.Course03;

public class Circle {
    double radius;

    void setRadius (double rad){
        radius = rad;
    }
    double getArea(){
        return 3.14 * (radius * radius);
    }
}