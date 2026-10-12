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
		    int m = sc.nextInt();
		    int count = 0;
		    while(m-- > 0){
		        int a = sc.nextInt();
		        if(a >= 1000){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
