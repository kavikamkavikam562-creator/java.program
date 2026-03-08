import java.util.Scanner;
public class Operators4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int creditLimit = scan.nextInt();

        System.out.print("Enter the amount : ");
        int purchaseAmount = scan.nextInt();

        System.out.print("Enter the card Blocked (1/0) :");
        int cardBlocked = scan.nextInt();

        if((purchaseAmount<=creditLimit)&&(cardBlocked==0))
        {
            System.out.println("Approved ");
        }
        else{
            System.out.println("Declined");
        }
        scan.close();

    }
}
