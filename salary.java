import java.util.Scanner;
public class salary{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int pay = scan.nextInt();
        int hra = scan.nextInt();
        int bonus = scan.nextInt();
        int tax = scan.nextInt();
        int fund = scan.nextInt();
        
        int home=pay+hra+bonus-tax-fund;
        System.out.println("Take home Salary ="+home);

    }
}
