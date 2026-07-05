import java.util.Scanner;
public class training{
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int r  = scan.nextInt();
         int c = scan.nextInt();

         int a[][] = new int[r][c];

         for(int i =0 ;i<r;i++){
            for(int j = 0;j<c;j++){
                a[i][j] = scan.nextInt();

            }
         }

         for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
              if( i != j && a[i][j] != 0){
                    System.out.print("Not Diagonal Matrix");
                    return;
            }
         }
      }
         System.out.print("Diagonal matrix");
 
         
             
   }
}
