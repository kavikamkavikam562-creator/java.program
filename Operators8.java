import java.util.Scanner;
public class Operators8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Age : ");
        int age = scan.nextInt();

        System.out.print("Enter the id proof : ");
        int idproof = scan.nextInt();

        if((age>=18)&&(idproof==1))
        {
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Denied");
        }
    }
}
