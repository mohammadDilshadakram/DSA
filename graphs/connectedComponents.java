import java.util.*;
public class connectedComponents {

    public static void addEdge(int u, int v, ArrayList<Integer> graph[]){
        graph[u].add(v);
        graph[v].add(u);

    }

    public static void dfsUtil(boolean visited[],int curr,ArrayList<Integer>graph[]){

        visited[curr]=true;
        for (int neighbour : graph[curr]) {
            if (!visited[neighbour]) {
                dfsUtil(visited, neighbour, graph);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> graph[]=new ArrayList[8]; 
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        boolean visited[]=new boolean[8];

        addEdge(1, 2, graph);
        addEdge(1, 3, graph);
        addEdge(1, 4, graph);
        addEdge(1, 5, graph);
        addEdge(2, 6, graph);
        addEdge(2, 7, graph);

        int discreteComponents=0;
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                discreteComponents++;
                dfsUtil(visited,i,graph);
            }
        }
        System.out.println(discreteComponents);
    }
}