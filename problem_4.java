import java.util.*;
public class problem_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter distance in feet: ");
            double distanceInFeet = sc.nextDouble();
            double yards = distanceInFeet / 3.0;
            double miles = yards / 1760.0;
            System.out.printf("%.2f feet = %.2f yards = %.6f miles%n", distanceInFeet, yards, miles);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}
