import java.util.*;
public class dfs {
    public class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void dfs(ArrayList<Edge>graph[],boolean isVisited[],int src){
        System.out.println(src);
        isVisited[src]=true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e=graph[src].get(i);
            if (!isVisited[graph[src].get(i)]) {
                dfs(graph, isVisited, e.dest);
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[]=new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        //for 0
        graph[0].add(new Edge(0, 1));
        arr[1].add(new Edge(1,0));
       arr[1].add(new Edge(1,2));
       arr[1].add(new Edge(1,3));

       //vertex 2
       arr[2].add(new Edge(2,1));
       arr[2].add(new Edge(2,3));
       arr[2].add(new Edge(2,4));

       arr[3].add(new Edge(3,1));
       arr[3].add(new Edge(3,2));

       arr[4].add(new Edge(4,2));

       dfs(graph, null, 0);
    }
}
