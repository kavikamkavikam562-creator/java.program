import java.util.Scanner;
public class ifelse10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the time of Day : ");
        String timeofday = scan.next();

        System.out.print("Enter the Power Consumption : ");
        double power = scan.nextDouble();

        System.out.print("Enter the Renewable Percentage : ");
        double renewable = scan.nextDouble();

        System.out.print("Enter the Rate Tier : ");
        String ratetier = scan.next();

        double rate = 0;
        
        if(ratetier.equals("Basic"))
        {
            rate = 0.18;
        }
        else if(ratetier.equals("Time-of-Use"))
        {
            rate = 0.15;
        }
        else if(ratetier.equals("Premium-Green"))
        {
           rate = 0.12;
        }

        double multiplier = 0;

        if(timeofday.equals("Peak"))
        {
           multiplier = 1.5;
        }
        else if(timeofday.equals("Off-Peak"))
        {
            multiplier = 0.8;
        }
        else if(timeofday.equals("Super-Off-peak"))
        {
            multiplier = 0.5;
        }
        double credit = ((power * renewable) / 100) * rate;

        double cost = (power * rate * multiplier) - credit;

        double offpeakcost = (power * rate * 0.9) - credit;
   
        double savings = cost - offpeakcost;

        if(savings < 0)
        {
            savings = 0;
        }

        String recommendation = ""; 

        if (timeofday.equals("Peak") && renewable < 20) {
            recommendation = "Shift to Off-Peak";
        } else if (renewable >= 50) {
            recommendation = "Excellent! Continue";
        } else if (ratetier.equals("Basic") && power > 500) {
            recommendation = "Upgrade to Time-of-Use";
        }

        System.out.println("Base Rate: $" + rate);
        System.out.println("Rate Multiplier: " + multiplier + "x");
        System.out.println("Renewable Credit: $" +credit);
        System.out.println("Total Cost: $" + cost);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Potential Savings if shifted to Off-Peak: $" + savings);

        scan.close();

        

    }
}
