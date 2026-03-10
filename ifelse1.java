import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int rating = scan.nextInt();
        int years = scan.nextInt();
        String dept = scan.next();
        double baseSalary = scan.nextDouble();

        double percentage = 0;

        if (rating >= 3) {

            if (dept.equals("Critical")) {

                if (rating == 5 && years >= 5) {
                    percentage = 25;
                }
                else if (rating == 4 && years >= 10) {
                    percentage = 22;
                }
                else if (rating == 4) {
                    percentage = 15;
                }
                else if (rating == 3) {
                    percentage = 10;
                }

            } else {   // Non-Critical

                if (rating == 5) {
                    percentage = 18;
                }
                else if (rating == 4) {
                    percentage = 12;
                }
                else if (rating == 3) {
                    percentage = 8;
                }

            }

        }

        double bonus = baseSalary * (percentage / 100);

        String status;
        if (rating >= 3)
            status = "Eligible";
        else
            status = "Not Eligible";

        System.out.println("Performance Rating: " + rating);
        System.out.println("Years of Service: " + years);
        System.out.println("Department: " + dept);
        System.out.println("Bonus Percentage: " + percentage + "%");
        System.out.println("Bonus Amount: $" + bonus);
        System.out.println("Status: " + status);
    }
}