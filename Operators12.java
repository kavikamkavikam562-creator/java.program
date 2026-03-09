
import java.util.Scanner;

public class Operators12{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int file = scan.nextInt();
        int compression = scan.nextInt();

        int compressed = file >> compression;

        System.out.print(compressed);
    }
    
}