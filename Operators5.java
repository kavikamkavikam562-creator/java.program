import java.util.Scanner;
public class Operators5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the salary : ");
        int salary = scan.nextInt();

        System.out.print("Enter the credit score : ");
        int creditScore = scan.nextInt();

        if((salary> 25000)&&(creditScore>700))
        {
            System.out.println("Approved");
        }
        else
        {
            System.out.println("Rejected");
        }
         scan.close();
    }
}
