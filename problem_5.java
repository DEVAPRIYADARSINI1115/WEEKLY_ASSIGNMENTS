import java.util.*;
public class problem_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter unit price (INR): ");
            double unitPrice = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double total = unitPrice * quantity;
            System.out.printf("Total purchase price for %d items at INR %.2f each is INR %.2f%n", quantity, unitPrice, total);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
