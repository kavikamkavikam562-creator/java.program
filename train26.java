import java.util.*;

class train26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();

            if (X <= 100)
                System.out.println(X);
            else if (X <= 1000)
                System.out.println(X - 25);
            else if (X <= 5000)
                System.out.println(X - 100);
            else
                System.out.println(X - 500);
        }
    }
}