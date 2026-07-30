import java.util.Scanner;
public class streak16
{
    public static void distint(int a[] , int start , int end){
       for(int i = start , j = end;i < j;i++,j--){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
       }
       
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }
        
        int k = scan.nextInt();
        distint(a , 0 , k-1);
        distint(a , k , n - 1);
        distint(a , 0, n - 1);

        for (int i = 0;i < n;i++){
           System.out.print(a[i]+" ");
        }

    }
}