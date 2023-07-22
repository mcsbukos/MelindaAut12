package ro.course.Course06;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import static ro.course.Course06.WorkInClass.circleArea;

public class WorkInClassExample2 {
    public static void main(String[] args) throws MyCustomException {
      //  System.out.println(circleArea(-20));

        try {
            int age = Integer.parseInt(args[0]);
            System.out.println("Age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("There was a problem with the parameter");

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyCustomException("The first argument needs to be an int");
        }
        finally {
            System.out.println("Finally code will run even if exception occurs");
        }
        double aria;
        try {
            aria = circleArea(-5);
            System.out.println(aria);
        } catch (IllegalArgumentException e) {
            aria = circleArea(4);
            System.out.println("Something went wrong");
        }
        System.out.println("aria: " + aria);
    }
    public static double circleArea(double radius) throws IllegalArgumentException {
        if (radius<0) {
            throw new IllegalArgumentException("radius should be positive");
        }
        return Math.PI*radius*radius;
    }

    //       catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
    //           System.out.println("There was a problem with the parameter");
    //           //e.printStackTrace();


    //  } catch (ArrayIndexOutOfBoundsException e) {
    //      System.out.println("There is no arguments set up as a parameter");
    //      e.printStackTrace();
    // } catch ( NumberFormatException e) {
    //            System.out.println("The argument cannot be transformed in number");
    //            e.printStackTrace();
    //        }
    // System.out.println("the program runs");

}


