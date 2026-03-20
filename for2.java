import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;
        int highest = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            String grade;
            if (score >= 85) grade = "A";
            else if (score >= 70) grade = "B";
            else if (score >= 60) grade = "C";
            else if (score >= 50) grade = "D";
            else grade = "F";

            String status;
            if (score >= 60) {
                status = "Pass";
                pass++;
            } else {
                status = "Fail";
                fail++;
            }

            total += score;
            if (score > highest) highest = score;

            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);
            System.out.println();
        }

        double avg = (double) total / n;

        System.out.println("Total Students: " + n);
        System.out.println("Class Average: " + avg);
        System.out.println("Highest Score: " + highest);
        System.out.println("Students Passed: " + pass);
        System.out.println("Students Failed: " + fail);
    }
}
