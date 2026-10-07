import java.util.*;

class train50 {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            dfs(i, n, k, list);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        Arrays.sort(ans);
        return ans;
    }

    void dfs(int num, int n, int k, ArrayList<Integer> list) {
        if (String.valueOf(num).length() == n) {
            list.add(num);
            return;
        }

        int digit = num % 10;

        if (digit + k <= 9)
            dfs(num * 10 + digit + k, n, k, list);

        if (k != 0 && digit - k >= 0)
            dfs(num * 10 + digit - k, n, k, list);
    }
}
