import java.util.*;
import java.lang.*;
import java.io.*;

class train72
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
		    int a = sc.nextInt() , x = sc.nextInt();
		    int count = 0;
		    for(int i = 0;i < a;i++){
		        if(sc.nextInt() >= x){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}