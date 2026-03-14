import java.util.Scanner;
public class ifelse11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the order Type : ");
        String orderType = scan.next();

        System.out.print("Enter the Loyalty Status : ");
        String loyalty = scan.next();

        System.out.print("Enter the Order Value : ");
        double ordervalue = scan.nextDouble();

        System.out.print("Enter the Time Slot : ");
        String timeSlot = scan.next();

        int discount = 0;

        if(loyalty.equals("Gold"))
        {
            discount = 15;
        }
        else if(loyalty.equals("Silver"))
        {
            discount = 10;
        }
        else if(loyalty.equals("Bronze")) 
        {
           discount = 5;
        }
        else if(loyalty.equals("None"))
        {
            discount = 0;
        }

        int adjustment = 0;

        if(timeSlot.equals("Peak"))
        {
            adjustment = 0;
        }
        else if(timeSlot.equals("Regular"))
        {
            adjustment = 0;
        }
        else if(timeSlot.equals("Late-Night"))
        {
            adjustment = -5;
        }
        double service = 0.0;

        if(orderType.equals("Delivery"))
        {
            service = 0.1;
        }
        else if(orderType.equals("Takeout"))
        {
            service = 0.03;
        }

        double discounted_value = ordervalue * (1 - discount/100);
        
        double finalAmount = discounted_value + service;
        
        String priority = "";

        if(timeSlot == "Delivery")
        {
          priority = "High";
        }
        else if(timeSlot == "Regular")
        {
            priority = "Medium";
        }
        else if(timeSlot == "Late-Night")
        {
            priority = "Low";
        }
        int prepTime = 0;

        if (priority.equals("High")) {
            if (orderType.equals("Delivery")) {
               prepTime = 25;
            }else{
               prepTime = 30;
            }
        } else if (priority.equals("Medium")) {
            prepTime = 20;
        } else {
            prepTime = 15;
        }
        System.out.println("Order Type : "+orderType);
        System.out.println("Loyalty Status : "+loyalty);
        System.out.println("Order Value : "+ordervalue);
        System.out.println("Time Slot : "+timeSlot);
        System.out.println("Base Discount : "+discount +"%");
        System.out.println("Time-Based Adjustment : "+adjustment+"%");
        System.out.println("Service Fee : $"+service);
        System.out.println("Final Amount : $"+finalAmount);
        System.out.println("Kitchen priority : "+priority);
        System.out.println("Estimated prep Time : "+prepTime);
        scan.close();
        }

    }

