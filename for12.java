import java.util.Scanner;
class for12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of vehicles : ");
        int N = scan.nextInt();
            
        for(int i = 0;i < N;i++){
            System.out.print("Enter the Vehicle Type : ");
            String vehicleType = scan.next();
            System.out.print("Enter the Hours Parked : ");
            Double hoursParked = scan.nextDouble();
            
        }
    }
}