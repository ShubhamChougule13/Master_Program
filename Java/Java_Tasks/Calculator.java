
public class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Addition: " + c.add(20, 5));
        System.out.println("Subtraction: " + c.subtract(20, 5));
        System.out.println("Multiplication: " + c.multiply(20, 5));
        System.out.println("Division: " + c.divide(20, 5));

        System.out.println("\nTesting division by zero:");
        c.divide(20, 0);
    }
}
