import java.util.Scanner;
public class Gym{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baseSalary = scan.nextInt();
        int sessions = scan.nextInt();
        int payPerSession = scan.nextInt();
        int bonus = scan.nextInt();
        int maintenanceFee = scan.nextInt();
        int Salary;
        Salary = baseSalary + (sessions * payPerSession) + bonus - maintenanceFee;
        System.out.println("Final Salary = "+Salary);
    }
}