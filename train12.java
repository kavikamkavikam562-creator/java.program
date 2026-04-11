import java.util.Scanner;

public class train12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if(result.indexOf(String.valueOf(c)) == -1)
            {
                result.append(c);
            }
        }
        
        System.out.print(result.toString());
    }
}