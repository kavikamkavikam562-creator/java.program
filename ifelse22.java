
import java.util.*;

public class ifelse22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();
        String season = sc.nextLine();
        String payment = sc.nextLine();

        double t1 = 0, t2 = 0, t3 = 0, t4 = 0;

        if (type.equals("Residential")) {
            if (units > 0) t1 = Math.min(units, 100) * 0.10;
            if (units > 100) t2 = Math.min(units - 100, 200) * 0.15;
            if (units > 300) t3 = Math.min(units - 300, 200) * 0.25;
            if (units > 500) t4 = (units - 500) * 0.30;
        } else if (type.equals("Commercial")) {
            if (units > 0) t1 = Math.min(units, 100) * 0.12;
            if (units > 100) t2 = Math.min(units - 100, 200) * 0.18;
            if (units > 300) t3 = Math.min(units - 300, 200) * 0.25;
            if (units > 500) t4 = (units - 500) * 0.25;
        } else if (type.equals("Industrial")) {
            if (units > 0) t1 = Math.min(units, 100) * 0.08;
            if (units > 100) t2 = Math.min(units - 100, 200) * 0.12;
            if (units > 300) t3 = Math.min(units - 300, 200) * 0.20;
            if (units > 500) t4 = (units - 500) * 0.20;
        }

        double total = t1 + t2 + t3 + t4;

        double seasonAdj = 0;
        if (season.equals("Summer")) seasonAdj = 15;
        else if (season.equals("Winter")) seasonAdj = -10;

        total = total * (1 + seasonAdj / 100.0);

        double discount = 0;
        if (payment.equals("Auto-Pay")) discount = 5;
        else if (payment.equals("Online")) discount = 3;

        total = total * (1 - discount / 100.0);

        double avg = total / units;

        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Customer Type: " + type);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + payment);
        System.out.println("Tier 1 Cost (0-100): $" + t1);
        System.out.println("Tier 2 Cost (101-300): $" + t2);
        System.out.println("Tier 3 Cost (301-500): $" + t3);
        System.out.println("Tier 4 Cost (501+): $" + t4);
        System.out.println("Seasonal Adjustment: " + (int)seasonAdj + "%");
        System.out.println("Payment Discount: " + (int)discount + "%");
        System.out.printf("Total Bill: $%.2f\n", total);
        System.out.printf("Average Rate: $%.2f/kWh\n", avg);
    }
}

