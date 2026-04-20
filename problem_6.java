import java.util.*;
public class problem_6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter dividend: ");
            int number1 = sc.nextInt();
            System.out.print("Enter divisor: ");
            int number2 = sc.nextInt();

            if (number2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                int quotient = number1 / number2;
                int remainder = number1 % number2;
                System.out.printf("%d / %d = %d with remainder %d%n", number1, number2, quotient, remainder);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
        }
    }
}
