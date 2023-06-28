package ro.homework.homework03;

public class Test {

    public static void main(String[] args) {
                int height = 8;
                int width = 15;
         for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("\n");
        }

        System.out.println();

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

}
