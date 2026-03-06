import java.util.Scanner;
public class School{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        int ratePer = scan.nextInt();
        int maintenance = scan.nextInt();
        int driverAllowance = scan.nextInt();
        int subsidy = scan.nextInt();
        int Transport_fee = (distance*ratePer) + maintenance + driverAllowance - subsidy;
        System.out.println("Total Transport Fee = "+Transport_fee);
    }
    }
