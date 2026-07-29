import java.util.Scanner;
public class streak15
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int result = 0 , pos = 1;
        while(n > 0){
            int r = n % 10;
            if(k != r){
                result = r * pos + result;
                pos = pos * 10;
            }
            n = n / 10;
        }
        System.out.print(result);
    }
}

