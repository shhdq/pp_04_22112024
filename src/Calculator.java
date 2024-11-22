public class Calculator {
    // addition
    public double add(double a, double b) {
        return a + b;
    }

    // subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // multipication
    public double multiply(double a, double b) {
        return a * b;
    }

    // division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }
}
