import java.util.Scanner;

public class streak13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int result = 0;
        int place = 1;

        while (n > 0) {
            int digit = n % 10;

            if (digit != k) {
                result = digit * place + result;
                place *= 10;
            }

            n /= 10;
        }

        System.out.println(result);
    }
} 