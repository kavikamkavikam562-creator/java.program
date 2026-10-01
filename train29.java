import java.util.*;
import java.lang.*;
import java.io.*;

class train28
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int total = a * b;
		    
		    System.out.println((total + 3) / 4);
		}

	}
}
