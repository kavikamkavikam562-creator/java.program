import java.util.Scanner;
public class Youtube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ads = scan.nextInt();
        int sponser = scan.nextInt();
        int affiliate = scan.nextInt();
        int tax  = scan.nextInt();
        int production = scan.nextInt();
        int income = ads + sponser + affiliate - tax - production;
        System.out.println("Final Youtude Income = "+income);


    }
}
