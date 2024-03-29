package ro.homework.homework05;

public class CalculatorHomework {

    public double compute(double firstParam, double secondParam, String operator)
            throws IllegalArgumentException {
        double result;
        switch (operator) {
            case "+":
                result = firstParam + secondParam;
                break;
            case "-":
                result = firstParam - secondParam;
                break;
            case "*":
                result = firstParam * secondParam;
                break;
            case "/":
                if (secondParam == 0) {
                    throw new IllegalArgumentException("Divide by ZERO");
                } else {
                    result = firstParam / secondParam;
                }
                break;
            case "SQRT":
                if (firstParam < 0) {
                    throw new IllegalArgumentException("Error: ");
                } else {
                    result = Math.sqrt(firstParam);
                }
                break;
            default: {
                throw new IllegalArgumentException("UNSUPPORTED OPERATOR: " + operator);
            }
        }
        return result;
    }

}