import java.util.Scanner;
public class streak19 {
    public static int kthSmallest(int[] a, int k) {
        int n = a.length;

        // Sort in ascending order using i and j loops
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {   // ascending order
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a[k - 1];  // directly return k-th smallest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        if (k <= n) {
            System.out.println("The " + k + "-th smallest element is: " + kthSmallest(arr, k));
        } else {
            System.out.println("Invalid k (greater than array size).");
        }

        sc.close();
    }
}