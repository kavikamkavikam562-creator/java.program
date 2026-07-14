import java.util.Scanner;
public class train15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the number : ");
        int n = scan.nextInt();

        while(n > 0 || sum > 9){
            if(n == 0){
                n = sum;
                sum = 0;
            } 
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
