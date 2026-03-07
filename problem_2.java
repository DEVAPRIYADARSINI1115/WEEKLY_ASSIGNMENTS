import java.util.*;
public class problem_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base of triangle (cm): ");
            double base = sc.nextDouble();
            System.out.print("Enter height of triangle (cm): ");
            double height = sc.nextDouble();
            double areaCm2 = 0.5 * base * height;
            double areaIn2 = areaCm2 / (2.54 * 2.54);
            System.out.println("Triangle area:");
            System.out.printf("  %.2f sq cm\n", areaCm2);
            System.out.printf("  %.2f sq in\n", areaIn2);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
