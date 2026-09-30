import java.util.Scanner;
public class for6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Account Balance : ");
        double initial_bal = scan.nextDouble();

        System.out.print("Enter the number of Withdrawal Attempts (1 to 20) : ");
        int N = scan.nextInt();

        double remaining = initial_bal;
        String yes = "";
        int a = 0;
        int b = 0;
        double sum = 0;
        double sum1 = 0;
        double balance = 0;
        



        for(int i = 0;i < N;i++)
        {
            double withdrawal = scan.nextDouble();

            if(withdrawal <= initial_bal)
            {
                yes = "Approved";
                a++;
                initial_bal = initial_bal - withdrawal;
                sum = sum + withdrawal;
                balance = remaining - initial_bal;
            }
            else
            {
                yes = "Insufficient Funds";
                b++;
            }
            sum = sum + withdrawal;
            balance = remaining - initial_bal;
            
            System.out.println("Transaction "+i+" : $"+withdrawal);
            System.out.println("Status : "+yes);
            System.out.println("Remaining Balance : $"+initial_bal);


        }
        System.out.println("Total Transcation : "+N);
        System.out.println("Successful Withdrawals : "+a);
        System.out.println("Failed Withdrawals : "+b);
        System.out.println("Final Balance : $"+balance);
        System.out.println("Total Withdrawn : $"+sum);



    }
}
