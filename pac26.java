import java.util.Scanner;
class pac26{
    public void anagram(){
       Scanner scan = new Scanner(System.in);
       String str1 = scan.next();
       String str2 = scan.next();
       if(str1.length() != str2.length()){
        System.out.print("Not Anagram");
        return;
       }
       for(int i = 0;i<str1.length();i++){
         char c = str1.charAt(i);
        for(int j = 0;j<str2.length();i++){
            char c1 = str2.charAt(j);
            if(c == c1){
                System.out.print(c1 +" ");
            }
        }
       }

    }
    public static void main(String[] args) {
        pac26 obj = new pac26();
        obj.anagram();
    }

}