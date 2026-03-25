import java.util.Scanner;

public class for4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of Sales : ");
        int N = scan.nextInt();

        double sumSales = 0;
        double sumCommissions = 0;
        String topRep = "";
        double topSales = 0;

        for (int i = 0; i < N; i++) {
            String repName = scan.next();
            double salesAmt = scan.nextDouble();

            int rate;
            if (salesAmt <= 40000) {
                rate = 5;
            } else if (salesAmt <= 80000) {
                rate = 8;
            } else if (salesAmt <= 100000) {
                rate = 10;
            } else if (salesAmt <= 150000) {
                rate = 12;
            } else {
                rate = 15;
            }

            double bonus;
            if (salesAmt >= 150000) {
                bonus = 3000;
            } else if (salesAmt >= 100000) {
                bonus = 2000;
            } else {
                bonus = 0;
            }

            double commission = salesAmt * (rate / 100.0);
            double payout = commission + bonus;

            System.out.println("Sales Rep: " + repName);
            System.out.println("Sales Amount: $" + salesAmt);
            System.out.println("Commission Rate: " + rate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + payout);
            System.out.println();

            sumSales += salesAmt;
            sumCommissions += commission;

            if (salesAmt > topSales) {
                topSales = salesAmt;
                topRep = repName;
            }
        }

        System.out.println("Total Sales Reps: " + N);
        System.out.println("Total Sales: $" + sumSales);
        System.out.println("Total Commissions: $" + sumCommissions);
        System.out.println("Top Performer: " + topRep);

        scan.close();
    }
}
