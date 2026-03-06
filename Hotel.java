
import java.util.Scanner;

public class Hotel{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       int rooms = scan.nextInt();
       int price = scan.nextInt();
       int serviceCharges =  scan.nextInt();
       int commissions = scan.nextInt();
       int revenue = (rooms * price) + serviceCharges - commissions;
       System.out.println("Total Revenue = "+revenue);
    }
}