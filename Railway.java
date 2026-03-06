import java.util.Scanner;
public class Railway{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int genPass = scan.nextInt();
        int genFare = scan.nextInt();
        int acPass = scan.nextInt();
        int acFare = scan.nextInt();
        int platform = scan.nextInt();
        int maintenance = scan.nextInt();
        int fuel = scan.nextInt();
        int Net_revenue = (genPass * genFare) + (acPass * acFare) + platform - maintenance - fuel;
        System.out.println("Net Railway Revenue = "+Net_revenue);
    }
}