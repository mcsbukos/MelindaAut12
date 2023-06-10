package ro.sit.ro.course;
public class Course02 {
          public static void main(String[] args) {
            System.out.println("Hello World");
            int number, numberOfCircles;
            number = 5;
            int secondNumber = 2;
            System.out.println(number);
            System.out.println(secondNumber);
            System.out.println(number + "" + secondNumber);
            int suma =  number + secondNumber;
            // number = 10;
            suma = number + secondNumber;
            System.out.println("Suma este: " + suma);
            String name;
            final String FIRST_NAME = "Darth Veder";
            name = "Sidius";
            System.out.println(number + name + secondNumber);
            System.out.println();
            int produs = number * secondNumber;
            System.out.println("produs: " + produs);
            System.out.println(number + "+" + secondNumber + "=" + suma);
            final double PI = 3.141;
            boolean isNegative = number < 0;
            System.out.println(isNegative);
            char caracter = 'a';
            byte a = 127;
            byte b = 100;
            short suma2 = (short) (a+b);
            System.out.println(suma2);
            String numeComplet = FIRST_NAME + " " + name;
            System.out.printf(numeComplet);

            int impartire = number / secondNumber;
            System.out.println("Rezultatul impartirii este: " + impartire);
            float impartire2 = (float) number / secondNumber;
            System.out.println("Rezultatul impartirii este: " + impartire2);
            int modul = number % secondNumber;
            System.out.println("Restul impartirii este: " + modul);
            boolean isNumberPositive = number > 0;
            boolean isNumberNegative = number < 0;
            if (isNumberPositive) {
              System.out.println("numarul este mai mare de zero");
            } else if(isNumberNegative) {
              System.out.println("numarul este negativ");
            } else {
              System.out.println("numarul este zero");
            }

          }
    }
