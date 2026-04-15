import java.util.*;

class pac21 {
    static String conRevstr(String S1, String S2) {
        String r1 = new StringBuilder(S1).reverse().toString();
        String r2 = new StringBuilder(S2).reverse().toString();

        return r1 + r2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S1 = scan.next();
        String S2 = scan.next();

        System.out.print(conRevstr(S1, S2));
    }
}
