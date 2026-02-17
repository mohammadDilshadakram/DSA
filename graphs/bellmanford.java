import java.util.*;
public class bellmanford {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void helper(ArrayList<Edge>graph[],int src,int V,boolean visited[],int dist[]){
        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int j2 = 0; j2 < graph[j].size(); j2++) {
                    Edge e=graph[j].get(j2);
                    if (dist[e.src]!=Integer.MAX_VALUE && dist[e.src]+e.wt<dist[e.dest]) {
                        dist[e.dest]=dist[e.src]+e.wt;
                    }
                }
            }
        }
        for (int j = 0; j < graph.length; j++) {
                for (int j2 = 0; j2 < graph[j].size(); j2++) {
                    Edge e=graph[j].get(j2);
                    if (dist[e.src]!=Integer.MAX_VALUE && dist[e.src]+e.wt<dist[e.dest]) {
                        System.out.println("Negative weight cycle is present");
                        return;

                    }else{
                        System.out.println("Negative weight cycle is not present");
                        return;
                    }
                }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        boolean[] visited=new boolean[V];
        int dist[]=new int[V];
        //0 vertice
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 8));

        //1 vertice
        graph[1].add(new Edge(1, 2, 3));
        graph[1].add(new Edge(1,4,6));

        //2 vertice
        graph[2].add(new  Edge(2, 3, 2));

        //3 vertice
        graph[3].add(new Edge(3, 4, 10));
        int src=0;
        for (int i = 0; i < dist.length; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }
        helper(graph, src, V, visited, dist);
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }

    }
}
