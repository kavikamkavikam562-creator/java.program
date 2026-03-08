
import java.util.Scanner;

public class Operators10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the units : ");
        int units = scan.nextInt();

        System.out.print("Enter the voltage : ");
        int voltage = scan.nextInt();

        if((units > 500) || (voltage == 1))
        {
            System.out.println("Alert");
        }
        else
        {
            System.out.println("Normal");
        }
        scan.close();
    }
}
