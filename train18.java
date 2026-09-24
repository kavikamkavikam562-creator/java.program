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
		    int b = sc.nextInt();
		    int count = a / 6;
		    System.out.print(a % 6);
		    if(a % 6 != 0){
		        count++;
		    }
		    System.out.println(b * count);
		}

	}
}
