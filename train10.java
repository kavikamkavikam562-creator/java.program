import java.util.Scanner;

public class train10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int countUnique = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int count = 0;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == c){
                    count++;
                }
            }

          
            if(count == 1){
                countUnique++;
            }
        }

        System.out.print(countUnique);
        scan.close();
    }
}
