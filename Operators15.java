import java.util.Scanner;
public class Operators15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the signal value : ");
        int signalvalue = scan.nextInt();

        System.out.print("Enter the toggle Mask : ");
        int togglemask = scan.nextInt();

        int Toggled_Signal = signalvalue ^ togglemask;

        System.out.println("Toggled Signal : "+Toggled_Signal);
        scan.close();

    }
    
}
