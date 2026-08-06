
import java.util.Scanner;

class streak22 {
public static void hexTodec(String s){
   int dec = 0;
   for(int i = 0;i < s.length();i++){
     char ch = s.charAt(i);
     int value;
     if(ch >= '0' && ch <= '9'){
        value = ch - '0';
     }
     else{
        value = ch - 'A' + 10;
     }
    dec = dec * 16 + value;
   }
   System.out.print(dec);
}
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.nextLine();
       hexTodec(s);
       
      
    }
}