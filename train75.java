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
		    int a = sc.nextInt() , x = sc.nextInt() , y = sc.nextInt();
		    System.out.println(y % x == 0 && y / x <= a ? "YES" : "NO");
		}

	}
}
