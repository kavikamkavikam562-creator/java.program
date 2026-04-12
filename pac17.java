//public Adding two numurical string with same or different length
import java.util.Scanner;
public class pac17 {
  
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s1=sc.next();
     String s2=sc.next();
     int c=0,n;
     String r="";
     if(s1.length()<s2.length())
     { n=s1.length();}
     else
     {n=s2.length();}
     int j=s1.length()-1;
     int k=s2.length()-1;
     for(int i=n-1;i>=0;i--)
     {
         int a=s1.charAt(j)-'0';
         int b=s2.charAt(k)-'0';
         int t=a+b+c;
         r=r+(t%10);
         c=t/10;
         j--;
         k--;
     }
     
     if(s1.length()<s2.length())
     {
        for(int i=k;i>=0;i--)
        {
         int a=s2.charAt(i)-'0';
         int t=a+c;
         r=r+(t%10);
         c=t/10;
        }
     }
     else
     {
          for(int i=j;i>=0;i--)
        {
         int a=s1.charAt(i)-'0';
         int t=a+c;
         r=r+(t%10);
         c=t/10;
        }
     }
         if(c>0)
         { r=r+c; }
        StringBuffer sb=new StringBuffer(r);
        System.out.println(sb.reverse());
    }
} {
    
}
