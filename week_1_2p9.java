import java.util.Scanner;
public class week_1_2p9 {
     public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double fee;
            double discountPercent;

            System.out.print("Enter Student Fee: ");
            fee = input.nextDouble();

            System.out.print("Enter Discount Percentage: ");
            discountPercent = input.nextDouble();

            double discount = (discountPercent / 100) * fee;
            double finalFee = fee - discount;

            System.out.println("The discount amount is INR " + discount +
                    " and final discounted fee is INR " + finalFee);
        }
    }
}
