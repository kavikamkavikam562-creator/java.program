import java.util.Scanner;
public class streak14{
    public static int sumCheck(int a[] , int n){
        int sum = 0;
        for (int i = 0;i < n;i++){
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }
        int result = sumCheck(a , n);
        System.out.println("Sum : "+result);

        if(result % 2 == 0){
            System.out.print("Category : Even");
        }
        else{
            System.out.print("Category : Odd");
        }
    }
}