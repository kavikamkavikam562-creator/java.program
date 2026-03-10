import java.util.Scanner;
public class Operators14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the permissionA : ");
        int a = scan.nextInt();
        System.out.print("Enter the permissionB : ");
        int b = scan.nextInt();
        int c = a | b;
        System.out.println("Merged Permission Code : "+c);
        scan.close();

    }
}
