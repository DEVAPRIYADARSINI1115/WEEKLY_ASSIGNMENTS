import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheitResult = (celsius * 9.0 / 5.0) + 32.0;
            System.out.printf("%.2f celsius = %.2f fahrenheit%n", celsius, fahrenheitResult);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}
