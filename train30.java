import java.util.*;

class train30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n + 1];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        h[n] = 0;

        Stack<Integer> stack = new Stack<>();
        long max = 0;

        for (int i = 0; i <= n; i++) {

            while (!stack.isEmpty() && h[i] < h[stack.peek()]) {

                int height = h[stack.pop()];

                int width;

                if (stack.isEmpty())
                    width = i;
                else
                    width = i - stack.peek() - 1;

                max = Math.max(max, (long) height * width);
            }

            stack.push(i);
        }

        System.out.println(max);
    }
}
