import java.util.Scanner;

public class train11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int[] count = new int[256];

        
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
        }

        int nonRepeatCount = 0;

      
        for(int i = 0; i < s.length(); i++){
            if(count[s.charAt(i)] == 1){
                nonRepeatCount++;
            }
        }

        System.out.print(nonRepeatCount);
        scan.close();
    }
}