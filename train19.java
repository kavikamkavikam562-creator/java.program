import java.util.*;
import java.lang.*;
import java.io.*;

class train18
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0;i < n;i++){
		    int a = sc.nextInt();
		    
		    if(a + 3 <= 10){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}

	}
}
