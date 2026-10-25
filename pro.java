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
	        int a = sc.nextInt();
	        if(a % 3 == 1){
	            System.out.println("HUGE");
	        }
	        else if(a % 3 == 2){
	            System.out.println("SMALL");
	        }
	        else{
	            System.out.println("NORMAL");
	        }
	    }

	}
}
