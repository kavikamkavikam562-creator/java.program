import java.util.Scanner;
public class train2{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        float  N = scan.nextFloat();
        float N1 = scan.nextFloat();
        float N2 = scan.nextFloat();

        System.out.println("Square : "+ Math.sqrt(N));
        System.out.println("Power : "+ Math.pow(N1,N2));
        
    }
}