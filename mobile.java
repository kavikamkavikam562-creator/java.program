import java.util.Scanner;
public class mobile{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int extraGB = scan.nextInt();
        int rateperGB = scan.nextInt();
        int percentage = scan.nextInt();
        int N = extraGB*rateperGB;
        float M = percentage/100F;
        float totalbill = cost+N+M;
        System.out.println("Total Bill = "+totalbill);



        
    }
    }
