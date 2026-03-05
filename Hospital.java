import java.util.Scanner;
public class Hospital{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int roomCharge = scan.nextInt();
    int days = scan.nextInt();
    int medicineCost = scan.nextInt();
    int labFees = scan.nextInt();
    int insuranceCoverage = scan.nextInt();
    int finalbill = (roomCharge*days)+ medicineCost + labFees - insuranceCoverage;
    System.out.println("Final Bill = "+finalbill);
        
    }
    }
