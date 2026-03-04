import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter total sales amount: ");
        double sales = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        System.out.print("Enter GST percentage: ");
        double gstPercent = sc.nextDouble();

        double discountedAmount = sales - (sales * discountPercent / 100);

        
        double finalRevenue = discountedAmount + (discountedAmount * gstPercent / 100);

        
        System.out.println("Final Revenue = " + finalRevenue);

        sc.close();
    }
}