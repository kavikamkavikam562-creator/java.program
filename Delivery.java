import java.util.Scanner;
public class Delivery{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int deliveries = scan.nextInt();
        int payout = scan.nextInt();
        int incentive = scan.nextInt();
        int fuelCost = scan.nextInt();
        int Net_Earnings = (deliveries * payout) + incentive - fuelCost;
        System.out.println("Driver Earning = "+Net_Earnings);

    }
}