import java.util.*;
import java.lang.*;
import java.io.*;

class train23
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int empty = 0;
		    if(a == 0) empty++;
		    if(b == 0) empty++;
		    if(c == 0) empty++;
		    
		    if(empty >= 2){
		        System.out.println("Water filling time");
		    }
		    else{
		        System.out.println("Not now");
		    }
		}

	}
}