import java.util.Scanner;

public class ifelse24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance = sc.nextDouble();
        double order = sc.nextDouble();
        sc.nextLine();
        String time = sc.nextLine();
        String weather = sc.nextLine();

        double base = 3.0;
        double distanceCharge = distance;

        double peak = 0;
        if (time.equals("Lunch")) peak = 2.5;
        else if (time.equals("Dinner")) peak = 2.0;
        else if (time.equals("Late-Night")) peak = 1.5;

        double weatherCharge = 0;
        if (weather.equals("Rain")) weatherCharge = 2;
        else if (weather.equals("Snow")) weatherCharge = 3;
        else if (weather.equals("Storm")) weatherCharge = 5;

        double discount = 0;
        if (order >= 30 && order < 50) discount = 1;
        else if (order >= 50 && order < 75) discount = 3;
        else if (order >= 75) discount = 5;

        double total = base + distanceCharge + peak + weatherCharge - discount;
        if (total < 2.99) total = 2.99;

        int timeEst = (int)(distance * 8);
        if (time.equals("Lunch") || time.equals("Dinner")) timeEst += 10;

        if (weather.equals("Rain")) timeEst += 5;
        else if (weather.equals("Snow")) timeEst += 10;
        else if (weather.equals("Storm")) timeEst += 15;

        String priority = "Standard";
        if (order > 60) priority = "Express";
        else if (time.equals("Lunch") || time.equals("Dinner")) priority = "High";

        System.out.println("Delivery Distance: " + distance + " miles");
        System.out.println("Order Value: $" + order);
        System.out.println("Time Slot: " + time);
        System.out.println("Weather Condition: " + weather);
        System.out.println("Base Delivery Fee: $" + base);
        System.out.println("Distance Surcharge: $" + distanceCharge);
        System.out.println("Peak Time Surcharge: $" + peak);
        System.out.println("Weather Surcharge: $" + weatherCharge);
        System.out.println("Order Value Discount: $" + discount);
        System.out.printf("Final Delivery Fee: $%.1f\n", total);
        System.out.println("Estimated Delivery Time: " + timeEst + " minutes");
        System.out.println("Service Priority: " + priority);
    }
}
