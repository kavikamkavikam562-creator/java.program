import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        Arrays.sort(cards);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(i);
        }

        int[] ans = new int[n];

        for (int value : cards) {
            int pos = q.poll();
            ans[pos] = value;

            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
