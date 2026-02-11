import java.util.*;

public class bipartite {

    public static void addEdge(int u, int v, ArrayList<Integer> graph[]) {
        graph[u].add(v);
        graph[v].add(u);
    }

    public static boolean bipartie(ArrayList<Integer> graph[], int color[], int start, Queue<Integer> q,
            boolean visited[]) {
        q.add(start);

        color[start] = 0;
        while (!q.isEmpty()) {
            int curr = q.remove();
            visited[curr] = true;
            for (int neighbour : graph[curr]) {
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    if (color[neighbour] == -1) {
                        if (color[curr] == 0) {
                            color[neighbour] = 1;
                        } else {
                            color[neighbour] = 0;
                        }
                    }
                } else if (color[curr] == color[neighbour]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 8;
        ArrayList<Integer> graph[] = new ArrayList[v];
        boolean visited[] = new boolean[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        int color[] = new int[v];
        for (int j = 0; j < color.length; j++) {
            color[j] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        addEdge(1, 2, graph);
        addEdge(1, 3, graph);
        addEdge(1, 4, graph);
        addEdge(1, 5, graph);
        addEdge(2, 6, graph);
        addEdge(2, 7, graph);
        addEdge(6, 3, graph);

        if (bipartie(graph, color, 1, q, visited)) {
            System.out.println("The graph is bipartite");
        } else {
            System.out.println("The graph is not bipartite");
        }
    }
}
