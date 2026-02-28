import java.util.*;
public class Cheapest_Flights_Within_K_Stops {

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
    public static class Pair implements Comparable<Pair>{
        int v;
        int dist;
        int stops;
        Pair(int v,int dist,int stops){
            this.v=v;
            this.dist=dist;
            this.stops=stops;
        }
        public int compareTo(Pair p2){
            return Integer.compare(this.dist, p2.dist);
        }
    }
    public static void helper(ArrayList<Edge>graph[],int src,PriorityQueue<Pair>q,int maxStops,int dist[]){
        q.add(new Pair(src, 0, 0));
        while (!q.isEmpty()) {
            Pair curr=q.poll();
            
            if (curr.stops>maxStops) {
                continue;
            }
            
            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e=graph[curr.v].get(i);
                
                    if (dist[curr.v]+e.wt<dist[e.dest]) {
                        dist[e.dest]=dist[curr.v]+e.wt;
                    }
                    q.add(new Pair(e.dest, dist[e.dest], curr.stops+1));
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Pair>q=new PriorityQueue<>();
        ArrayList<Edge> graph[]=new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }

        int dist[]=new int[5];
        
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
        helper(graph,0,q,2,dist);
        System.out.println(dist[2]);


    }
}
