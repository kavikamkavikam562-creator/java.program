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
	      int x = sc.nextInt();
	      int n = sc.nextInt();
	      
	      int req = (n + 99) / 100;
	      System.out.println(Math.max(0 , req - x));
	  }

	}
}