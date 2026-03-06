import java.util.Scanner;
public class Agriculture{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int yeildPerAcre = scan.nextInt();
        int acres = scan.nextInt();
        int extraYield = scan.nextInt();
        int damagedCrops = scan.nextInt();
        int Final_Yeild = (yeildPerAcre * acres) + extraYield - damagedCrops;
        System.out.println("Marketable Yield = " + Final_Yeild);

    }
}