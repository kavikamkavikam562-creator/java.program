import java.util.Scanner;
public class train5 {

    public static int sum(int N){

        int last = N % 10;
        int first = 0;
        while(N >= 10)
        {
            first = N / 10;
            N = N /10;
        }
        int ans = first + last;
        return ans;
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int N = scan.nextInt();
        int ans = sum(N);
        System.out.println("The sum of last and first number is : "+ans);

    }
}
