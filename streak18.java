import java.util.Scanner;
public class streak18{
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int dec1 = 0 , base1 = 1;
     while(n > 0){
        int r = n % 10;
        dec1 = dec1 + r * base1;
        n = n / 10;
        base1 = base1 * 2;
    }
    int dec2 = 0 , base2 = 1;
     while(m > 0){
        int r = m % 10;
        dec2 = dec2 + r * base2;
        m = m / 10;
        base2 = base2 * 2;
    }
    int num = dec1 + dec2;
    int bi = 0 , base3 = 1;
    while(num > 0){
        int r = num % 2;
        bi = bi + r * base3;
        num = num / 2;
        base3 = base3 * 10;
    }
    System.out.print(bi);
   }
}