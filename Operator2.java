import java.util.Scanner;
public class Operator2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter the AccountBalance : ");
        int accountbalance = scan.nextInt();

        System.out.print("Enter the WithdrawalAmount : ");
        int withdrawalAmount = scan.nextInt();

        System.out.print("Enter the Dailylimit : ");
        int dailylimit = scan.nextInt();

        if((withdrawalAmount<=accountbalance)&&(withdrawalAmount<dailylimit))
            {
            System.out.println("Transaction Approved");
            }
        else
            {
               System.out.println("Transaction Declined");
            }
        scan.close();

    }
    
}
