import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int a = (500 - 2 * x) + (1000 - 4 *(x + y));
		    int b = (1000 - 4 * y) + (500 - 2 *(x + y));
		    
		    System.out.println(Math.max(a , b));
		}

	}
}