import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format: baseCost extraGB ratePerGB tax%
        double baseCost = sc.nextDouble();
        double extraGB = sc.nextDouble();
        double ratePerGB = sc.nextDouble();
        double taxPercent = sc.nextDouble();


        double extraCharges = extraGB * ratePerGB;

        double totalBeforeTax = baseCost + extraCharges;

        double totalBill = totalBeforeTax + (totalBeforeTax * taxPercent / 100);

        System.out.println("Total Bill = " + totalBill);

        sc.close();
    }
}