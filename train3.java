import java.util.Scanner;
public class train3{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int N1 = scan.nextInt();

        for(int i = N;i <= N1;i++ )
        {   

            if(N <= 1 || N1 <= 1)
            {
                System.out.print("is not a prime number");
            }

            if(i%1==0 && i%i-1==0)
            {
                System.out.println("The Prime number from"+N+"to"+N1+":"+i);
            }
          
        }
    }
}