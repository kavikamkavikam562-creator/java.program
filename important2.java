import java.util.ArrayList;
import java.util.Scanner;

public class important2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> food = new ArrayList<>();

        System.out.print("Enter the number of foods that needs to be ordered : ");
        int num_foods = scan.nextInt();
        scan.nextLine();

        for(int i = 1;i <= num_foods;i++)
        {
            System.out.print("Enter the food # "+i+": ");
            String foods = scan.next();
            food.add(foods);
        }
        System.out.println("The ordered food items are");
        System.out.print(food);
        scan.close();

    }

}
