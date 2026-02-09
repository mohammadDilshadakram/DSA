import java.util.*;
public class hasPath2 {

    public static void addEdge(int u,int v,ArrayList<Integer>graph[]){
        graph[u].add(v);
        graph[v].add(u);
    }

    public static boolean checkPath(ArrayList<Integer>graph[],boolean visited[],int src,int dest){
        if (src==dest) {
            return true;
        }
        visited[src]=true;
        for (int neighbour : graph[src]) {
            if (!visited[neighbour] && checkPath(graph, visited, neighbour, dest)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
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

        if (checkPath(graph, visited, 1, 3)) {
            System.out.println("there is a path");
        }else{
            System.out.println("There is no path that exits");
        }
    }
}
