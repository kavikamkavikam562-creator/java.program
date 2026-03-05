import java.util.Scanner;
public class Factory{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rodsperHour = scan.nextInt();
        int hoursWorked = scan.nextInt();
        int overtimeRods = scan.nextInt();
        int rejectedRods = scan.nextInt();
        int Finalproduction = (rodsperHour*hoursWorked) + overtimeRods -rejectedRods;
        System.out.println("Final Production = "+Finalproduction);
    }
}