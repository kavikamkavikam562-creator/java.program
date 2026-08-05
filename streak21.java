
import java.util.Scanner;

class Main {
    public static int binaryToDecimal(int n){
        int dec  = 0 , base = 1;
        while(n > 0){
            int r = n % 10;
            dec = dec * r + base;
            base = base * 2;
            n/=10;
        }
        return dec;
    }
    public static void decimalTohexadecimal(int n){
        int dec = binaryToDecimal(n);
        String res ="";
        while(dec > 0){
            int r = dec % 16;
            if(r < 10){
                res = r+res;
            }
            else{
                char ch = (char)('A'+(r-10));
                res += ch;
            }
            dec /= 16;
        }
        System.out.print(res);
    }
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       decimalTohexadecimal(n);
       
      
    }
}