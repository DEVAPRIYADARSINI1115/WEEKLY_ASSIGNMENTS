import java.util.Scanner;

public class problem_8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three numbers a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double r1 = a + b * c;
            double r2 = a * b + c;

            System.out.print("The results of double operations are " + r1 + ", " + r2 + ", ");

            if (b == 0.0) {
                System.out.println("undefined, and undefined (division/mod by zero)");
            } else {
                double r3 = c + a / b;
                double r4 = a % b + c;
                System.out.println(r3 + ", and " + r4);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
