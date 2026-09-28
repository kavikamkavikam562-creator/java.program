import java.util.*;
import java.lang.*;
import java.io.*;

class train22
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even = 0 , odd = 0;
		for(int i = 0;i < n;i++){
		    int x = sc.nextInt();
		    if(x % 2 == 0){
		        even++;
		    }
		    else{
		        odd++;
		    }
		}
        System.out.println(even > odd ? "READY FOR BATTLE" : "NOT READY");
	}
}
