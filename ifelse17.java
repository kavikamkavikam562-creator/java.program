import java.util.Scanner;
public class ifelse17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Card tier : ");
        String cardtier = scan.next();

        System.out.print("Enter the purchase Category : ");
        String purchase = scan.next();

        System.out.print("Enter the Transaction Amount : ");
        Double transaction = scan.nextDouble();

        System.out.print("Enter the Promotion Status : ");
        String promotion = scan.next();

        Double base_points = 1.0;

        double category = 0.0;

        if(purchase.equals("Groceries"))
        {
            category = 2.0;
        }
        else if(purchase.equals("Dining"))
        {
            category = 2.5;
        }
        else if(purchase.equals("Travel"))
        {
            category = 3.0;
        }
        else if(purchase.equals("Gas"))
        {
            category= 2.0;
        }
        else
        {
            category = 1.0;
        }

        Double multipler = 0.0;

        if(cardtier.equals("Basic"))
        {
           multipler = 1.0;
        }
        else if(cardtier.equals("Gold"))
        {
           multipler = 1.25;
        }
        else if(cardtier.equals("Platinum"))
        {
            multipler = 1.5;
        }
        else if(cardtier.equals("Black"))
        {
            multipler = 2.0;
        }

        Double promotional = 0.0;

        if(promotion.equals("None"))
        {
            promotional = 1.0;
        }
        else if(promotion.equals("Double-points"))
        {
            promotional = 2.0;
        }
        else if(promotion.equals("Triple-points"))
        {
            promotional = 3.0;
        }
        

        Double points = transaction * base_points * category * multipler * promotional;

        Double  cash = points * 0.01;

        String tier = "";

        if(cardtier.equals("Basic"))
        {
            tier = "Standard";
        }
        else if(cardtier.equals("Gold"))
        {
            tier = "Enhanced";
        }
        else if(cardtier.equals("Platinum"))
        {
            tier = "Premium";
        }
        else if(cardtier.equals("Black"))
        {
            tier = "Elite";
        }

        System.out.println("Card Tier : "+cardtier);
        System.out.println("Purchase Category : "+purchase);
        System.out.println("Transaction Amount : "+transaction);
        System.out.println("Promotional Status : "+promotion);
        System.out.println("Base Points Rate : "+base_points+" points per dollar");
        System.out.println("Category Bonus : "+category+"x");
        System.out.println("Tier Multiplier : "+multipler+"x");
        System.out.println("Promotional Multiplier : "+promotional+"x");
        System.out.println("Points Earned : "+points);
        System.out.println("Equivalent Cash Value : $"+cash);
        System.out.println("Rewards Tier : "+tier);




    }
}
