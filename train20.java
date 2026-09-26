import java.util.*;
import java.lang.*;
import java.io.*;

class train20
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
	 while(T-- > 0){
	     int x = sc.nextInt();
	     int y = sc.nextInt();
	     int z = sc.nextInt();
	     if(z * 2 > x * y){
	         System.out.println("YES");
	     }
	     else{
	         System.out.println("NO");
	     }
	 }
	}
}
