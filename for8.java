import java.util.Scanner;
public class for8{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of products : ");
        int N = scan.nextInt();

        int discount = 0;
        double subtotal = 0;
        double total = 0; 
        int tot_quan = 0;
        double original = 0;

        for(int i = 0;i < N;i++)
        {
            System.out.print("Enter the product name : ");
            String productname = scan.next();

            System.out.print("Enter the price : ");
            double price = scan.nextDouble();

            System.out.print("Enter the quantity : ");
            int quantity = scan.nextInt();

            if(quantity == 1)
            {
                discount = 0;
            }
            else if(quantity >= 2 && quantity <=4)
            {
                discount = 10;
            }
            else if(quantity >= 5 && quantity >= 9)
            {
                discount = 15;
            }
            else if(quantity >= 10)
            {
                discount = 20;
            }

            subtotal = price * quantity * (1 - discount / 100);

            System.out.println("Product : "+productname);
            System.out.println("Unit Price : "+price);
            System.out.println("Quantity : "+quantity);
            System.out.println("Discount : "+discount+"%");
            System.out.println("Subtotal : $"+subtotal);
            
            total = total + price;
            tot_quan = tot_quan + quantity;
            original = total * tot_quan;



            
        
        }
        System.out.println("Total Items : "+N);
        System.out.println("Original Total :"+original);
        System.out.println("Total Discount : "+);
    }
}
 