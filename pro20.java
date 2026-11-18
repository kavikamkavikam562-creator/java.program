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
		    for(int i = 0;i < m;i++){
		        int a = sc.nextInt();
		        if(a >= 10 && a <= 60){
		            count++;
		        }
		    }
		    System.out.println(count);
		}

	}
}