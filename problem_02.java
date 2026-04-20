import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsiusResult = (fahrenheit - 32.0) * 5.0 / 9.0;
            System.out.printf("%.2f fahrenheit = %.2f celsius%n", fahrenheit, celsiusResult);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}
