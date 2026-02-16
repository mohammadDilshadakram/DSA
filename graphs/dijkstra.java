import java.util.*;
public class dijkstra {

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
    public static void helper(ArrayList<Edge>graph[],int src,int dist[],boolean visited[],PriorityQueue<Integer>q){
        q.add(src);
        while (!q.isEmpty()) {
            int curr=q.poll();
            visited[curr]=true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e=graph[curr].get(i);
                if (dist[curr]+e.wt<dist[e.dest]) {
                dist[e.dest]=dist[curr]+e.wt;
                if (!visited[e.dest]) {
                    q.add(e.dest);
                }
              }
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Edge> graph[]=new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        int dist[]=new int[5];
        boolean visited[]=new boolean[5];
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->dist[a]-dist[b]);

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
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
            
        }
        for (int i = 0; i < visited.length; i++) {
            System.out.println(dist[i]);
        }
        System.out.println("The distances after dijskarta algorithm");
        helper(graph,src,dist,visited,q);
        for (int i = 0; i < visited.length; i++) {
            System.out.println(dist[i]);
        }

    }
}