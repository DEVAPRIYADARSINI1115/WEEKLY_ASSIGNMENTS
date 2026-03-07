import java.util.*;
public class problem_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the perimeter of the square: ");
            double perimeter = sc.nextDouble();
            double side = perimeter / 4.0;
            System.out.printf("A square with perimeter %.2f has side length %.2f%n", perimeter, side);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric perimeter.");
        }
    }
}
