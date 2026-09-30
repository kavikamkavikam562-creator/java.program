import java.util.*;

class train27 {

    static int countOdd(long n) {
        if (n == 0)
            return 0;

        int digit = (int)(n % 10);

        if (digit % 2 != 0)
            return 1 + countOdd(n / 10);

        return countOdd(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.print(countOdd(n));
    }
}