import java.util.Scanner;
class pac25 {
    public int lastDigit(int n) {
       if(n < 0){
           n = (-1 * (n));
       }
       int result = n % 10;
       return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pac25 obj = new pac25();
        obj.lastDigit(n);
    }
    
    
}