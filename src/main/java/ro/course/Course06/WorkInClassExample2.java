package ro.course.Course06;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import static ro.course.Course06.WorkInClass.circleArea;

public class WorkInClassExample2 {
    public static void main(String[] args) {
        System.out.println(circleArea(-20));

        try {
            int age = Integer.parseInt(args[0]);
            System.out.println("Age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("There was a problem with the parameter");
        } finally {
            System.out.println("Finally code will run even if exception occurs");
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
        System.out.println("the program runs");
    }
}
