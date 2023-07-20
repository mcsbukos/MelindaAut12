package ro.course.Course06;

public class WorkInClass {
    public static void main(String[] args) {
        System.out.println(circleArea("a"));
    }
    public static double circleArea(Object radius) throws IllegalArgumentException {
       if (radius instanceof Double) {
           double r = (Double) radius;
        if (r < 0) {
            throw new IllegalArgumentException("radius should be positive");
        } else if (r == 0) {
            throw new IllegalArgumentException(" radius should be not equal to 0");
        } else {
            return Math.PI * r * r;
        }
    } else {
           throw new IllegalArgumentException(" radius should be a number not a char");
       }

    }

}
