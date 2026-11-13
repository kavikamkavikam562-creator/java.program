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
		    int s = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    int free = s - x - y;
		    if(free >= z){
		        System.out.println(0);
		    }
		    else if(free + y >= z){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(2);
		    }
		}
		

	}
}
