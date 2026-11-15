import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int even = n / 2;
		    int odd = (n + 1) / 2;
		    
		    int tot = even * a + odd * b;
		    System.out.println(tot);
		}

	}
}
