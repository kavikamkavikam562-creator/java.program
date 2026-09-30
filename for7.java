import java.util.Scanner;
public class for7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of consumers : ");
        int N = scan.nextInt();


        double bill = 0;
        String category = "";
        int total_units = 0;
        double total_revenue = 0;
        double average = 0;
        
        for (int i=0;i<N;i++)
        {
           System.out.print("Enter the customer ID : ");
           String customer = scan.next();

           System.out.print("Enter the units Consumed : ");
           int units = scan.nextInt();

           if(units > 0 && units < 100)
           {
              bill = units * 0.10 ;
           }
           else if(units > 101 && units < 200)
           {
            bill =  (100 * 0.10) + (units - 100) * 0.13;
           }
           else if(units > 201 && units < 300)
           {
            bill =  (100 * 0.10) + (100 * 0.13) + (units - 200) * 0.16;
           }
           else if(units > 300)
           {
            bill =  (100 * 0.10) + (100 * 0.13) + (100 * 0.16) + (units - 300) * 0.20;
           }
           if(units <= 200)
           {
             category = "Low Usage";
           }
           else if(units >=201 && units <= 300)
           {
            category = "Medium Usage";
           }
           else if(units > 300)
           {
            category = "High Usage";
           }

           total_units = total_units + units;

           total_revenue = total_revenue + bill;

           System.out.println("Consumer ID : "+customer);
           System.out.println("Units Consumed : "+units);
           System.out.println("Bill Amount : "+bill);
           System.out.println("Category : "+category);

        }

        average = total_revenue / N;

        System.out.println("Total Consumers : "+N);
        System.out.println("Total Units Consumed : "+total_units);
        System.out.println("Total Revenue : "+total_revenue);
        System.out.println("Average Bill : "+average);
        
        scan.close();
    }
}
