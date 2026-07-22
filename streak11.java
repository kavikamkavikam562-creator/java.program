import java.util.Scanner;
public class streak11{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int cube = n*n*n;
    int sq = n*n;

    System.out.print(sq+"\n"+cube);


  }
}