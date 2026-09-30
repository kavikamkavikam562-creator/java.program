import java.util.Scanner;
public class train13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = 0 , count1 = 0 , rev = 0;
        System.out.print("Enter the number : ");
        int n =scan.nextInt();

        for (int i = 1;i <= n;i++){
            if(n % i == 0){
                count++ ;
            }
        }
        if(count == 2){
            for(int i = n;i > 0;i=i/10){
              int r = i % 10;
              rev = rev * 10 + r;
            }
            for(int i = 1;i <= rev;i++){
                if(rev % i == 0){
                    count1++;
                }
            }
            if(count1 == 2){
                System.out.println("Twisted Prime");
            }
            else{
                System.out.println("Not Twisted Prime");
            }
        }
        else{
            System.out.println("Not Twisted Prime");
        }
    }
}