import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the minutes : ");
        int min = scan.nextInt();
        int hour = min / 60;
        min = min % 60;
        
        System.out.print(hour+" hr "+min+" minutes");
    }
}