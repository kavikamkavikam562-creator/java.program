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
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(a * y < b * x){
		        System.out.println("Chef");
		    }
		    else if(a * y > b * x){
		        System.out.println("Chefina");
		    }
		    else{
		        System.out.println("Both");
		    }
		}
	}
}
