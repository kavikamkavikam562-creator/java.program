import java.util.Scanner;
class pac24{
    public static void utility(int x) {
        while(x >= 0){
            System.out.print(x+" ");
            x--;
        }
        
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        utility(x);
    }
}
