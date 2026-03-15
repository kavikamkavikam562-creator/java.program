import java.util.Scanner;

public class ifelse14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        int months = sc.nextInt();
        sc.nextLine();
        String access = sc.nextLine();
        String addOns = sc.nextLine();

        double baseFee = 0;
        double discount = 0;
        double accessFee = 0;
        double addOnFee = 0;

        if (tier.equals("Basic")) baseFee = 40;
        else if (tier.equals("Premium")) baseFee = 80;
        else if (tier.equals("Elite")) baseFee = 120;
        else baseFee = 150;

        if (months == 1) discount = 0;
        else if (months == 6) discount = 10;
        else if (months == 12) discount = 15;
        else if (months == 24) discount = 25;

        if (access.equals("Single-Location")) accessFee = 0;
        else if (access.equals("Regional")) accessFee = 20;
        else accessFee = 50;

        if (addOns.equals("None")) addOnFee = 0;
        else if (addOns.equals("Personal-Training")) addOnFee = 100;
        else if (addOns.equals("Classes")) addOnFee = 50;
        else addOnFee = 200;

        double discountedBase = baseFee * (1 - discount / 100);
        double monthlyTotal = discountedBase + accessFee + addOnFee;
        double contractTotal = monthlyTotal * months;

        double original = (baseFee + accessFee + addOnFee) * months;
        double savings = original - contractTotal;

        String category;
        if (tier.equals("Basic")) category = "Budget";
        else if (tier.equals("Premium") && monthlyTotal <= 120) category = "Standard";
        else if (tier.equals("Premium") || tier.equals("Elite")) category = "Premium";
        else category = "Luxury";

        System.out.println("Membership Tier: " + tier);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + access);
        System.out.println("Add-Ons: " + addOns);
        System.out.println("Base Monthly Fee: $" + baseFee);
        System.out.println("Contract Discount: " + (int)discount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addOnFee);
        System.out.println("Monthly Total: $" + monthlyTotal);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);
    }
}