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
		    int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
		    System.out.println(Math.min(a , (c / b)));
		}

	}
}
