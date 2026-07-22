import java.util.Scanner;
public class train14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0 , count1 = 0 , rev = 0;
        System.out.print("Enter the number : ");
        int n = scan.nextInt();
        int m = n;
        for(int i = 1;i <= n;i++){
            if(n % i == 0){
                count++;
           }
        }
        if(count > 2){
            System.out.println("Not Twisted Prime");
            return;
        }

        while(n > 0){
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        
        for(int i = 1;i <= rev;i++){
            if(rev % i == 0){
                count1++;
            }
        }
        if(count == 2 && count1 == 2){
            System.out.println("Twisted prime");
        }
        else{
            System.out.println("Not Twisted Prime");
        }
    }
}
