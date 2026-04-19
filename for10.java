import java.util.Scanner;
public class for10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of items from 1 to 30 : ");
        int N = scan.nextInt();
        System.out.print("Enter the Item Name : ");
        String item =  scan.next();
        System.out.print("Enter the price : ");
        Double price = scan.nextDouble();
        System.out.print("Enter the Quantity : ");
        int quantity = scan.nextInt();


        double total = 0;
        double tax = 0;
        double service = 0;
        double grand = 0;
        for(int i = 0;i < N;i++)
        {
            System.out.println("Item : "+item);
            System.out.println("Price : $"+price+"x"+quantity);
            double subtotal = price * quantity;
            System.out.println("Subtotal : $"+subtotal);

            total = total + subtotal;
            

        }
        tax = total * 0.08;
        service = total * 0.10;
        grand = total + tax + service;

        System.out.println("Subtotal : $"+total);
        System.out.println("Tax(8%) : $"+tax);
        System.out.println("Service : $"+service);
        System.out.println("Grand Total : $"+grand);


        

    }
}
