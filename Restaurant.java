import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Float totalbill = scan.nextFloat();
        Float service = scan.nextFloat();
        Float gst = scan.nextFloat();
        int numberofpeople = scan.nextInt();
        float ser = totalbill * service / 100;
        Float rem = (totalbill + ser) * (gst / 100);
        Float amount = (totalbill + ser + rem)/numberofpeople;
        System.out.println("Amount Per Person = "+amount);

    }
}
