import java.util.Scanner;
public class Operators7 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
          
        System.out.print("Enter the Cart Value : ");
        int cartvalue = scan.nextInt();

        System.out.print("Enter the PremiumMember (1/0) : ");
        int premiummember = scan.nextInt();

        if((cartvalue > 999)||(premiummember == 1))
        {
            System.out.println("Free Shipping");
        }
        else
        {
            System.out.println("Charges Applied");
        }
        scan.close();
    }
}
