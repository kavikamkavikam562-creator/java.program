import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Fees = scan.nextInt();
        int scholarship = scan.nextInt();
        int examfee = scan.nextInt();
        int libraryfee = scan.nextInt();
        int rem = Fees - (Fees * scholarship / 100);
        int Final = rem + examfee + libraryfee;
        System.out.println("Final Payable Fee = "+Final);
    }
}
