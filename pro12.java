
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (B > A && B - A <= X) {
                System.out.println("YES");
            } 
            else if (B < A && A - B <= Y) {
                System.out.println("YES");
            } 
            else if (B == A) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
