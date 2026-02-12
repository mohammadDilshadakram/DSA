import java.util.*;
public class detectCycle2 {
    public static void addEdge(int u,int v,ArrayList<Integer>graph[]){
        graph[u].add(v);
        graph[v].add(u);
    }

    public static boolean hasCycle(ArrayList<Integer>graph[],boolean visited[],int start,int parent){
        visited[start]=true;
        for (int neighbour : graph[start]) {
            if (!visited[neighbour]) {
                if(hasCycle(graph, visited, neighbour, start)){
                    return true;
            }
        }
            else if (neighbour!=parent) {
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

        if (hasCycle(graph, visited, 1, -1)) {
            System.out.println("Cycle detected");
        }else{
            System.out.println("Cycle not detected");
        }

    }
}
