// kamleshlodhi
import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("\nSelect the operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Square root");
        System.out.println("7. Logarithm (base 10)");
        System.out.println("8. Sine");
        System.out.println("9. Cosine");
        System.out.println("10. Tangent");
        System.out.println("11. Factorial");
        System.out.println("12. Absolute value");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 6:
                result = Math.sqrt(num1);
                System.out.println("Square root of " + num1 + ": " + result);
                result = Math.sqrt(num2);
                System.out.println("Square root of " + num2 + ": " + result);
                break;
            case 7:
                result = Math.log10(num1);
                System.out.println("Logarithm (base 10) of " + num1 + ": " + result);
                result = Math.log10(num2);
                System.out.println("Logarithm (base 10) of " + num2 + ": " + result);
                break;
            case 8:
                result = Math.sin(num1);
                System.out.println("Sine of " + num1 + ": " + result);
                result = Math.sin(num2);
                System.out.println("Sine of " + num2 + ": " + result);
                break;
            case 9:
                result = Math.cos(num1);
                System.out.println("Cosine of " + num1 + ": " + result);
                result = Math.cos(num2);
                System.out.println("Cosine of " + num2 + ": " + result);
                break;
            case 10:
                result = Math.tan(num1);
                System.out.println("Tangent of " + num1 + ": " + result);
                result = Math.tan(num2);
                System.out.println("Tangent of " + num2 + ": " + result);
                break;
            case 11:
                result = factorial((int) num1);
                System.out.println("Factorial of " + num1+ " " + result);
                                System.out.println("Factorial of " + num1 + ": " + result);
                break;
            case 12:
                result = Math.abs(num1);
                System.out.println("Absolute value of " + num1 + ": " + result);
                result = Math.abs(num2);
                System.out.println("Absolute value of " + num2 + ": " + result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static double factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            double fact = 1;
            for (int i = 2; i <= number; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}


