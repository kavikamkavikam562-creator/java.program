import java.awt.geom.Rectangle2D;
import java.util.Scanner;
public class for3{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of products : ");
        int N = scan.nextInt();
        
        String status = "";
        int reorder = 0 ;
        int low = 0;
        int critical = 0;
        int sum = 0;

        for(int i = 0 ;i < N ;i++)
        {
            String productname= scan.next();
            int currentstock = scan.nextInt();
            int minimum = scan.nextInt();

           if(currentstock >= minimum)
            {
               status = "Adequate";
            }
            else if(currentstock < minimum && currentstock>=minimum/2)
            {
                status = "Low Stock";
            }
            else if(currentstock < minimum/2)
            {
                status = "Critical";
            }
            if(status == "Adequate")
            {
                reorder = 0;
            }
            else if(status == "Low Stock")
            {
                reorder = (minimum - currentstock) + minimum/2 ;
            }
            else if(status == "Critical")
            {
                reorder = (minimum - currentstock) + minimum * (int)1.5  ;
            } 
            if(status == "Low Stock")
            {
                low++;
            }
            else if(status == "Critical")
            {
                critical++;
            }
            sum = sum + reorder; 
            System.out.println( "Products : "+productname);
            System.out.println("Current Stock : "+currentstock);
            System.out.println("Minimum Stock : "+minimum);
            System.out.println("Status : "+status);
            System.out.println("Reoder Quantity : "+reorder);
        }
        System.out.println("Total Products : "+N);
        System.out.println("Low Stock Items : "+low);
        System.out.println("Critical Items : "+critical);
        System.out.println("Total Reorder Quantity : "+sum);
        
        scan.close();

    }
}