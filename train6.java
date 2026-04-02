import java.util.Scanner;

public class train6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int N1 = scan.nextInt();
        int N2 = scan.nextInt();

        for(int i = N1; i <= N2; i++) {

            int count = 0;

            for(int j = 1; j <= i; j++) {   
                if(i % j == 0) {
                    count++;
                }
            }

            if(count == 2) {
                System.out.println(i);
            }
        }
    }
}