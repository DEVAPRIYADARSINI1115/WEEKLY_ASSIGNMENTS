import java.util.*;
public class problem_7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter three integers a, b, c: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int r1 = a + b * c;
            int r2 = a * b + c;

            if (b == 0) {
                System.out.println("b cannot be 0 for a/b and a%b operations.");
            } else {
                int r3 = c + a / b;
                int r4 = a % b + c;
                System.out.printf("The results of Int operations are %d, %d, %d, %d%n", r1, r2, r3, r4);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input; please enter integers only.");
        }
    }
}
