import java.util.Scanner;
public class Operators9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the user name (1/0) : ");
        int username = scan.nextInt();

        System.out.print("Enter the password : ");
        int password = scan.nextInt();

        System.out.print("Enter wheather the acoount is locked or not (1/0) : ");
        int accountlocked = scan.nextInt();

        if((username==1)&&(password==1)&&(accountlocked==0))
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failed");
        }
        scan.close();
    }
}
