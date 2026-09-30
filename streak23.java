import java.util.Scanner;
public class streak23{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    int start = 0 , end = s.length()-1;
    char c[] = s.toCharArray();
    while(start < end){
        char t = c[start];
        c[start] = c[end];
        c[end] = t;
    }

    for(int i = 0;i <c.length;i++){
        System.out.print(c[i]);
    }
   }
}