import java.util.Scanner;

public class ifelse8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        String location = sc.nextLine();
        int sqft = sc.nextInt();
        int age = sc.nextInt();
        int amenity = sc.nextInt();

        double price = 0;

       
        if(location.equals("Prime"))
            price = 400;
        else if(location.equals("Urban"))
            price = 300;
        else if(location.equals("Suburban"))
            price = 180;
        else
            price = 100;

        double baseValue = sqft * price;

     
        double ageAdjust = 0;

        if(age >= 0 && age <= 5)
            ageAdjust = 0;
        else if(age >= 6 && age <= 15)
            ageAdjust = -0.10;
        else if(age >= 16 && age <= 30)
            ageAdjust = -0.20;
        else
            ageAdjust = -0.35;

        double adjustedValue = baseValue + (baseValue * ageAdjust);

      
        double bonus = 0;

        if(amenity >= 80 && amenity <= 100)
            bonus = adjustedValue * 0.10;
        else if(amenity >= 60 && amenity <= 79)
            bonus = adjustedValue * 0.05;
        else if(amenity >= 40 && amenity <= 59)
            bonus = adjustedValue * 0.02;
        else
            bonus = 0;

        double finalValue = adjustedValue + bonus;

      
        String market;

        if(finalValue > 1000000)
            market = "Hot";
        else if(finalValue >= 500000)
            market = "Warm";
        else
            market = "Cold";

      
        System.out.println("Location Tier: " + location);
        System.out.println("Square Footage: " + sqft + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + amenity);
        System.out.println("Base Price Per Sq Ft: $" + price);
        System.out.println("Age Adjustment: " + (ageAdjust * 100) + "%");
        System.out.println("Amenity Bonus: $" + bonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + market);
    }
}