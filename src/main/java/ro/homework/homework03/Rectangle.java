package ro.homework.homework03;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = 0, c = 0, i, j;
        // r - denotes the number of rows
        // c - denotes the number of columns

        System.out.println("-----Enter the number of rows & columns-----");
        r = in.nextInt();
        c = in.nextInt();

        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }
    }
}
