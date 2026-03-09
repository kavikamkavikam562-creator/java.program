import java.util.Scanner;
public class Operators11{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int baseboxes = scan.nextInt();
        int levels = scan.nextInt();
        
        int capacity = baseboxes << levels;
        System.out.print(capacity);
    }
}