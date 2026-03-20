import java.util.Scanner;

public class PayrollProcessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        double totalPayroll = 0;

        for (int i = 0; i < N; i++) {

            String employee = scan.next();
            double baseSalary = scan.nextDouble();
            int performance = scan.nextInt();

            int increment = 0;

            if (performance == 5) {
                increment = 15;
            } else if (performance == 4) {
                increment = 10;
            } else if (performance == 3) {
                increment = 5;
            } else if (performance == 2) {
                increment = 2;
            } else {
                increment = 0;
            }

            double finalSalary = baseSalary * (1 + increment / 100.0);

            totalPayroll += finalSalary;

            System.out.println("Employee: " + employee);
            System.out.println("Base Salary: $" + baseSalary);
            System.out.println("Performance Rating: " + performance);
            System.out.println("Increment: " + increment + "%");
            System.out.println("Final Salary: $" + finalSalary);
            System.out.println();
        }

        double averageSalary = totalPayroll / N;

        System.out.println("Total Employees Processed: " + N);
        System.out.println("Total Payroll: $" + totalPayroll);
        System.out.println("Average Salary: $" + String.format("%.2f", averageSalary));

        scan.close();
    }
}