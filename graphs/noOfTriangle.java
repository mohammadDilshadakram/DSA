import java.util.*;
public class noOfTriangle {

    public static void addEdge(int u,int v,ArrayList<Integer>graph[]){
        graph[u].add(v);
        graph[v].add(u);
    }
    public static int countTrinagle(ArrayList<Integer>graph[],int src,int par,boolean visited[],int count){
        visited[src]=true;
        for (int neighbour : graph[src]) {
            if (!visited[neighbour]) {
                for (int secNeighbour : graph[neighbour]) {
                    if (par==secNeighbour) {
                        count++;
                    }
                }
                count+=countTrinagle(graph, neighbour, src, visited, count);
            }
            
        }
        return count;
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
        addEdge(2, 3, graph);
        int count=0;
        System.out.println(countTrinagle(graph, 1, -1, visited, count));
    }
}
