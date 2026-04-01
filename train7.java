import java.util.Scanner;
public class train7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the Starting year and Ending Year : ");
        int start_year = scan.nextInt();
        int end_year = scan.nextInt();

    for(int i = start_year;i <= end_year;i++)
    {
        if(i % 100 != 0){
            if(i % 4 == 0){
                System.out.println("Leap Year : "+i);
            }
        }
        else{
            if(i % 400 == 0){
                System.out.println("Leap Year : "+i);
            }
        }
    }

    }
}
