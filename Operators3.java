import java.util.Scanner;
public class Operators3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the working hours : ");
        int workinghours = scan.nextInt();

        System.out.print("Enter the attendance percentage : ");
        int attendancepercentage = scan.nextInt();

        if((workinghours>40)&&(attendancepercentage>90))
        {
            System.out.println("Bonus Eligible ");
        }
        else 
        {
            System.out.println("Not Eligible ");
        }
        scan.close();
    }
}
