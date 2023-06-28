package ro.homework.homework03;

import java.sql.SQLOutput;

public class Draw {
    public static void main(String[] args) {
        drawFullShape(10, 15);
        System.out.println();
        drawRectangleSides(5, 7);
        System.out.println();
        drawRectangleCorners(10, 10);
    }

    public static void drawFullShape(int width, int height) {
        // deseneaza un dreptunghi de 10 *10
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }

    public static void drawRectangleCorners(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i == 1 || i == height) && (j == 1 || j == width))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }

    public static void drawRectangleSides(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}




