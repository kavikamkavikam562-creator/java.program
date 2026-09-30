import java.util.Scanner;
public class streak20{
    public static boolean print(String s1 , String s2){
           if(s1.length() != s2.length()){
            return false;
           }
           for(int i = 0;i < s1.length();i++){
              char ch = s1.charAt(i);
              char ch1 = s2.charAt(i);
              if(ch >= 'A' && ch <= 'Z'){
                 ch = (char)(ch + 32);
              }
              if(ch1 >= 'A' && ch1 <= 'Z'){
                 ch1 = (char)(ch+32);
              }
           }
           for(int i = 0;i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
               return false;
            }
           }
           return true;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        System.out.print(print(s1, s2));

     }
}