import java.util.Scanner;
public class for5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int N = scan.nextInt();

        double rate = 0;
        String status = "";
        double sum = 0;
        int com = 0;
        int com2 = 0;
        int a=0;

        for(int i = 0;i < N;i++)
        {
            int day = scan.nextInt();
            int rooms = scan.nextInt();
            int total_rooms = scan.nextInt();
            
            rate = ((double)rooms / total_rooms) * 100;
            
            if(rate < 60.0)
            {
                status = "Low";
            }
            else if(rate <=79.0)
            {
                status = "Moderate";
            }
            else if(rate <=99.0)
            {
               status = "High";
            }
            else if(rate == 100.0)
            {
                status = "Full";
            } 
            System.out.println("Days : "+day);
            System.out.println("Rooms Occuppied : "+rooms);
            System.out.println("Total Rooms : "+total_rooms);
            System.out.println("Occupancy Rate : "+rate+"%");
            System.out.println("Status : "+status);
            sum = sum + rate;

            if(rooms>com)
            {
                com = rooms;
                com2 = day;
            }
            if(status.equals("Full"))
            {
                a++;
            }
        
        }
        double average = sum / N;
        System.out.println("Total Days Analyzed : "+N);
        System.out.println("Average Occupancy Rate : "+average);
        System.out.println("Peak Occupancy Day : Day "+com2);
        System.out.println("Days at Full Capacity : "+a);

        scan.close();
    }
}
