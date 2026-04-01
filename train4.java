import java.util.Scanner;
public class train4{

    public static void isPrime(int N) {
        if(N <= 1 ){
          System.out.println(N+"is not a prime number");
        }
        int count = 0;
        for(int i = 1;i<=N;i++)
        {
          if(N % i == 0)
          {
            count++;
          }
        }
        if(count == 2)
        {
            System.out.print("Prime");
        }
        else{
            System.out.println("Not prime");
        }

    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int N = scan.nextInt();
        isPrime(N);

        
        scan.close();
    }
}