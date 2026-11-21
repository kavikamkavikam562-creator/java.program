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
		    int a = sc.nextInt() , x = sc.nextInt();
		    int b = sc.nextInt() , y = sc.nextInt();
		    
		    if(a * y > b * x){
		        System.out.println("ALICE");
		    }
		    else if(a * y < b * x){
		        System.out.println("BOB");
		    }
		    else{
		        System.out.println("EQUAL");
		    }
		}
	}
}
