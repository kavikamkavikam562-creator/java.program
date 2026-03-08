import java.util.Scanner;
public class Operators6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Income : ");
        int familyincome = scan.nextInt();

        System.out.print("Enter the percentage : ");
        int percentage = scan.nextInt();

        if((familyincome < 200000)&&(percentage>=75))
        {
            System.out.println("Granted");
        }
        else
        {
            System.out.println("Not Granted");
        }
        scan.close();
    }
}
