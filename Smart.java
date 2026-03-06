
import java.util.Scanner;

public class Smart {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int resUsage = scan.nextInt();
         int resRate = scan.nextInt();
         int comUsage = scan.nextInt();
         int comRate = scan.nextInt();
         int connection = scan.nextInt();
         int penalty = scan.nextInt();
         int maintenance = scan.nextInt();
         int treatment = scan.nextInt();
         int Net_Revenue = (resUsage * resRate) + (comUsage * comRate) +  connection + penalty - maintenance - treatment;
         System.out.println("Net Water Revenue = "+Net_Revenue);

    }
}
