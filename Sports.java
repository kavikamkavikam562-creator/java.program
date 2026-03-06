import java.util.Scanner;
public class Sports {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int reg = scan.nextInt();
        int broadcast = scan.nextInt();
        int sponser = scan.nextInt();
        int prize = scan.nextInt();
        int rent = scan.nextInt();
        int advertising = scan.nextInt();
        int remaining_fund = reg + broadcast + sponser - prize - rent -advertising;
        System.out.println("Remaining Tournament Fund = "+remaining_fund);
    }
}
