import java.util.Scanner;
public class streak17{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a[] = new int[n];
        for(int i =0 ;i < n;i++){
            a[i] = scan.nextInt();
        }
        int start , end = n -1;
        if(n % 2 == 0){
            start = n / 2;
        }
        else{
            start = (n / 2 )+ 1;
        }
        while(start < end){
           int temp = a[start];
           a[start] = a[end];
           a[end] = temp;
           start++;
           end--;
        }
        for(int i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }

    }
}