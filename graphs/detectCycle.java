import java.util.*;

public class detectCycle {

    public static void addEdge(int u, int v, ArrayList<Integer> graph[]) {
        graph[u].add(v);
        graph[v].add(u);
    }

    public static boolean hasCycle(ArrayList<Integer> graph[], int curr, int parent, boolean visited[]) {

        visited[curr] = true;
        for (int neighbour : graph[curr]) {
            if (visited[neighbour] && parent != neighbour) {

                return true;
            }
            if (!visited[neighbour]) {
                if (hasCycle(graph, neighbour, curr, visited)) {
                    return true;
                }

            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = 8;
        ArrayList<Integer> graph[] = new ArrayList[v];
        boolean visited[] = new boolean[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(1, 2, graph);
        addEdge(1, 3, graph);
        addEdge(1, 4, graph);
        addEdge(1, 5, graph);
        addEdge(2, 6, graph);
        addEdge(2, 7, graph);
        addEdge(6, 3, graph);

        for (int i = 1; i < graph.length; i++) {
            if (!visited[i]) {
                if (hasCycle(graph, i, -1, visited)) {
                    System.out.println("The graph has cycle");
                    return;
                }
            } 
                
               
            
        }
        System.out.println("The graph does not have cycle");

    }
}
