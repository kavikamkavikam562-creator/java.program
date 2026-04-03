import java.util.Scanner;
public class train8 {

    public static int leap(int start,int end){
   

        if(start <= 0 || end <= 0)
        {
            System.out.println("Invalid Year's ");
            return 0 ;
        }
        for(int i = start;i<=end;i++)
        {
            if(i % 100 != 0)
            {
              if(i % 4 == 0)
                {
                   System.out.println("Leap Year : "+i);
                }  
            }
            else{
                if(i % 400 == 0)
                {
                  System.out.println("Leap Year : "+i);
                }
            }
   
        }
        return 0;

    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year's : ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        leap(start, end);

    }
}
