import java.util.*;

class train28 {

    static void merge(int[] a, int[] b, int i, int j, int last) {

        if (i == a.length && j == b.length)
            return;

        int x;

        if (i == a.length)
            x = b[j++];
        else if (j == b.length)
            x = a[i++];
        else if (a[i] < b[j])
            x = a[i++];
        else if (b[j] < a[i])
            x = b[j++];
        else {
            x = a[i];
            i++;
            j++;
        }

        if (x != last) {
            System.out.print(x + " ");
            last = x;
        }

        merge(a, b, i, j, last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        merge(a, b, 0, 0, Integer.MIN_VALUE);
    }
}
