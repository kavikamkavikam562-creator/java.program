import java.util.Scanner;
public class Cinema{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ticketRevenue = scan.nextInt();
        int snackRevenue = scan.nextInt();
        int maintenanceCost = scan.nextInt();
        int electricityBill = scan.nextInt();
        int Net_profit = ticketRevenue + snackRevenue - maintenanceCost -electricityBill;
        System.out.println("Net Profit = "+Net_profit);

    }
}