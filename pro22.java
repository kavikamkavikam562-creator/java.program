
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x = sc.nextInt(), y = sc.nextInt();
            System.out.println(Math.abs((x-1)/10 - (y-1)/10));
        }
    }
}
