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
		    int t = sc.nextInt();
		    String  s = sc.next();
		    
		    StringBuilder res = new StringBuilder();
		    for(int i = 0;i < t;i++){
		        char ch = s.charAt(i);
		        
		        if(ch == 'A'){
		            res.append('T');
		        }
		        else if(ch == 'T'){
		            res.append('A');
		        }
		        else if(ch == 'C'){
		            res.append('G');
		        }
		        else if(ch == 'G'){
		            res.append('C');
		        }
		    }
		    System.out.println(res);
		}

	}
}
