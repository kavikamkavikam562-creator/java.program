import java.util.*;
import java.lang.*;
import java.io.*;

class train35
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    
		    System.out.println(c* d >= a * b ?"Yes" : "No");
		}
	}
}