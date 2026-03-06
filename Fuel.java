import java.util.Scanner;
public class Fuel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int distance = scan.nextInt();
        int mileage = scan.nextInt();
        int fuelprice = scan.nextInt();
        int tollcharge = scan.nextInt();

        int Var1 = distance / mileage;
        int Var2 = fuelprice * Var1;
        int cost = Var2 + tollcharge;
        System.out.println("Total Trio Cost = "+cost);
        


    }
}
