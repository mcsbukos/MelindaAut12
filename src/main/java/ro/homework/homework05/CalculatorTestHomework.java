package ro.homework.homework05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTestHomework {
    CalculatorHomework calculator = new CalculatorHomework();
    @Test
    public void testAddition1() {
        double result = calculator.compute(5.0, 3.0, "+");
        System.out.println("The result for addition is: " + result);
        assertEquals(8.0, result, 0);
    }
    @Test
    public void testAddition2() {
        double result = calculator.compute(-7.0, 12.0, "+");
        System.out.println("The result for addition is: " + result);
        assertEquals(5.0, result, 0);
    }

    @Test
    public void testSubtraction1() {
        double result = calculator.compute(5.0, 3.0, "-");
        System.out.println("The result for subtraction is: " + result);
        assertEquals(2.0, result, 0);
    }
    @Test
    public void testSubtraction2() {
        double result = calculator.compute(0.0, 3.0, "-");
        System.out.println("The result for subtraction is: " + result);
        assertEquals(-3.0, result, 0);
    }

    @Test
    public void testMultiplication1() {
        double result = calculator.compute(7.0, 3.0, "*");
        System.out.println("The result for multiplication is: " + result);
        assertEquals(21.0, result, 0);
    }

    @Test
    public void testMultiplication2() {
            double result = calculator.compute(-2.0, 3.0, "*");
            System.out.println("The result for multiplication is: " + result);
            assertEquals(-6.0, result, 0);
    }

    @Test
    public void testDivision() {
        double result = calculator.compute(10.0, 2.0, "/");
        System.out.println("The result for division is: " + result);
        assertEquals(5.0, result, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        System.out.println("A number cannot be divided by 0");
        double result = calculator.compute(5.0, 0.0, "/");
        assertEquals(0, result, 0);
    }

    @Test
    public void testSquareRoot() {
        double result = calculator.compute(625.0, 0, "SQRT");
        System.out.println("The result for Square Root is: " + result);
        assertEquals(25.0, result, 0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootNegativeNumber() {
        System.out.println("This operation can be done only with non-negative real numbers. Please use only positive numbers ");
        double result = calculator.compute(-4.0, 0, "SQRT");
        assertEquals(2.0, result, 0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testUnsupportedOperator1() {
        System.out.println("Please replace the operator with one of the followings: + , -, * ,  /, SQRT! ");
        double result = calculator.compute(12.0, 0, "?");
        assertEquals(0, result, 0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testUnsupportedOperator2() {
        System.out.println("Please replace the operator with one of the followings: + , -, * ,  /, SQRT! ");
        double result = calculator.compute(25.0, 0, "&");
        assertEquals(0, result, 0);
    }
}
