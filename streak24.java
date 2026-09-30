import java.util.Scanner;
public class streak24{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int count = 1;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                count++;
            }
        }
        System.out.print(count);
    }
} 