
import java.util.Scanner;

public class Operator1{
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.print("Enter the theroy mark : ");
        float Theory = scan.nextFloat();
        System.out.print("Enter the practical mark :");
        Float practical = scan.nextFloat();
        float average = (Theory+practical)/2;

        if ((average>=60)&&(Theory>50)&&(practical>50))
            {
            System.out.println("PASS");
            }
        else if (Theory<50)
            {
            System.out.println("FAIL");
            }
        else{
            System.out.println("FAIL");
        }
    }
}