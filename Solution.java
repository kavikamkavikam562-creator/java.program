import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args)
    {
          Scanner scan = new Scanner(System.in);
          int a = scan.nextInt();
          int b = scan.nextInt();
          
          float result = a / b;
          int ans = (int)(result * 1000);
          result = (float) ans / 1000;
          System.out.print(result);
          
        
    }
        
    }
