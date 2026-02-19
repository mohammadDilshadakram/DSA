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
    public static class pair implements Comparable<pair>{   
        int v;
        int dist;
        pair(int v,int dist){
        this.v=v;
        this.dist=dist;
        }
        public int compareTo(pair p2){
            return Integer.compare(this.dist,p2.dist);
        }
    }
    public static void helper(ArrayList<Edge>graph[],int src,int dist[],boolean visited[],PriorityQueue<pair>q){
        q.add(new pair(src, 0));
        while (!q.isEmpty()) {
            pair curr=q.poll();
            if(visited[curr.v]){
                continue;

            }
            visited[curr.v]=true;
            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e=graph[curr.v].get(i);
                if (dist[curr.v]+e.wt<dist[e.dest]) {
                dist[e.dest]=dist[curr.v]+e.wt;
                if (!visited[e.dest]) {
                    q.add(new pair(e.dest, dist[e.dest]));
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
        PriorityQueue<pair>q=new PriorityQueue<>();

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