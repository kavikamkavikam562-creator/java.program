import java.util.Scanner;
public class Operators13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int connection = scan.nextInt();
        int appliance = scan.nextInt();
        int a = connection & appliance;
        
        if(a == appliance){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
        scan.close();
    }
}
