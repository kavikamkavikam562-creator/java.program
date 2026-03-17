import java.util.*;

public class ifelse25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double data = sc.nextDouble();
        int minutes = sc.nextInt();
        sc.nextLine();
        String intl = sc.nextLine();
        String device = sc.nextLine();

        String plan = "";
        double base = 0;

        if (data <= 2) {
            plan = "Basic 2GB";
            base = 25;
        } else if (data <= 5) {
            plan = "Standard 5GB";
            base = 40;
        } else if (data <= 20) {
            plan = "Premium Unlimited";
            base = 70;
        } else {
            plan = "Unlimited Max";
            base = 90;
        }

        double dataOver = 0;
        if (plan.equals("Standard 5GB") && data > 5) dataOver = (data - 5) * 10;

        double callOver = 0;
        if (minutes > 1000 && !plan.contains("Unlimited"))
            callOver = (minutes - 1000) * 0.05;

        double intlFee = 0;
        if (intl.equals("Light")) intlFee = 5;
        else if (intl.equals("Moderate")) intlFee = 15;
        else if (intl.equals("Heavy")) intlFee = 30;

        double deviceFee = 0;
        if (device.equals("Smartphone") || device.equals("Tablet")) deviceFee = 10;
        else if (device.equals("Hotspot")) deviceFee = 20;

        double total = base + dataOver + callOver + intlFee + deviceFee;

        double savings = 0;
        if (plan.equals("Standard 5GB") && data > 5) savings = 5;

        String category = "";
        if (plan.contains("Basic")) category = "Budget";
        else if (plan.contains("Standard")) category = "Standard";
        else if (plan.contains("Premium")) category = "Premium";
        else category = "Unlimited";

        System.out.println("Data Usage: " + data + " GB");
        System.out.println("Call Minutes: " + minutes + " minutes");
        System.out.println("International Usage: " + intl);
        System.out.println("Device Type: " + device);
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Base Plan Cost: $" + base);
        System.out.println("Data Overage: $" + dataOver);
        System.out.println("Call Overage: $" + callOver);
        System.out.println("International Fee: $" + intlFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + total);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);
    }
}