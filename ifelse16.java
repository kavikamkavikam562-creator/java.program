import java.util.Scanner;

public class ifelse16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String room = sc.nextLine();
        String season = sc.nextLine();
        int nights = sc.nextInt();
        sc.nextLine();
        String loyalty = sc.nextLine();

        double baseRate = 0;
        double seasonalMultiplier = 0;
        double stayDiscount = 0;
        double loyaltyDiscount = 0;

        if (room.equals("Standard")) baseRate = 150;
        else if (room.equals("Deluxe")) baseRate = 300;
        else if (room.equals("Suite")) baseRate = 500;
        else baseRate = 1000;

        if (season.equals("Off-Peak")) seasonalMultiplier = 0.7;
        else if (season.equals("Regular")) seasonalMultiplier = 1.0;
        else if (season.equals("Peak")) seasonalMultiplier = 1.5;
        else seasonalMultiplier = 2.0;

        if (nights <= 4) stayDiscount = 0;
        else if (nights <= 7) stayDiscount = 5;
        else if (nights <= 14) stayDiscount = 10;
        else stayDiscount = 20;

        if (loyalty.equals("None")) loyaltyDiscount = 0;
        else if (loyalty.equals("Member")) loyaltyDiscount = 10;
        else if (loyalty.equals("Gold")) loyaltyDiscount = 15;
        else loyaltyDiscount = 20;

        double seasonalRate = baseRate * seasonalMultiplier;
        double nightlyRate = seasonalRate * (1 - stayDiscount / 100) * (1 - loyaltyDiscount / 100);
        double totalCost = nightlyRate * nights;

        String upgrade = "None";
        if (loyalty.equals("Member")) upgrade = "Free breakfast";
        else if (loyalty.equals("Gold")) upgrade = "Free breakfast and spa access";
        else if (loyalty.equals("Platinum")) upgrade = "Concierge service, airport transfer, and fine dining";

        System.out.println("Room Category: " + room);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nights);
        System.out.println("Loyalty Tier: " + loyalty);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + (int)stayDiscount + "%");
        System.out.println("Loyalty Discount: " + (int)loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + nightlyRate);
        System.out.println("Total Booking Cost: $" + totalCost);
        System.out.println("Complimentary Upgrades: " + upgrade);
    }
}