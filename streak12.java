import java.util.Scanner;
public class streak12{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = scan.nextInt();
        int sum = 0 ;
        int count = 0;
        int avg = 0;


        int a[] = new int[n];
        System.out.print("Enter the elements in an array : ");

        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }

        avg = sum / n;

        for(int i = 0;i < n;i++){
           if(a[i] >= avg){
            count++;
           }
        }

        double percentage = ((double)count / n )* 100;

        System.out.println("Total Employees : "+n);
        System.out.println("Average Salary : "+avg);
        System.out.println("Employees Above Average : "+count);
        System.out.println("Percentage : "+percentage+"%");

        
    }
} 