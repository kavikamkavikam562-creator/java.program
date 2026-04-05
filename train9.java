import java.util.Scanner;

public class train9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int N = scan.nextInt();

        int count = 0;
        int temp = N;
        int rem = 0;
        int sum = 0;
        int temp1 = N;

        if (N <= 0) {
            System.out.println("Invalid number");
            return;
        }

        
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        
        while (temp1 > 0) {
            rem = temp1 % 10;
            sum = sum + (int)Math.pow(rem, count);
            temp1 = temp1 / 10;
        }

       
        if (sum == N) {
            System.out.println("Arm Strong");
        } else {
            System.out.println("Not Arm Strong");
        }
    }
}