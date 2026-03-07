import java.util.*;
public class problem_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double number1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = sc.nextDouble();
            double add = number1 + number2;
            double sub = number1 - number2;
            double mul = number1 * number2;
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                    + number1 + " and " + number2 + " is:");
            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
            if (number2 == 0.0) {
                System.out.println("Division: undefined (division by zero)");
            } else {
                double div = number1 / number2;
                System.out.println("Division: " + div);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}