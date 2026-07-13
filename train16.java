import java.util.Scanner;
public class train16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i < n;i++) 
        {
          arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if(max < arr[idx]){
                index = idx;
            }
        }
        System.out.print(index);
    }
}
