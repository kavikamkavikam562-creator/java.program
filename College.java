import java.util.Scanner;
public class College{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int reg = scan.nextInt();
        int sponser = scan.nextInt();
        int stall = scan.nextInt();
        int stage = scan.nextInt();
        int celebrity = scan.nextInt();
        int marketing = scan.nextInt();
        int remaining_fund = reg + sponser + stall - stage - celebrity - marketing;
        System.out.println("Remaining Fund = "+remaining_fund);

    }
}