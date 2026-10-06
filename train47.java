import java.util.*;

class train47 {
    public ArrayList<ArrayList<Integer>> adjacencyList(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (ArrayList<Integer> list : graph)
            Collections.sort(list);

        return graph;
    }
}