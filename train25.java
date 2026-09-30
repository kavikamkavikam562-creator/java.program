import java.util.*;

class train25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++)
            a[i][0] = sc.nextInt();

        for (int i = 0; i < n; i++)
            a[i][1] = sc.nextInt();

        Arrays.sort(a, (c, b) -> b[0] - c[0]);

        int fleets = 0;
        double last = 0;

        for (int i = 0; i < n; i++) {
            double time = (double)(target - a[i][0]) / a[i][1];

            if (time > last) {
                fleets++;
                last = time;
            }
        }

        System.out.println(fleets);
    }
}