import java.util.*;
public class bfs {

    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }


    public static void bfsTraversal(ArrayList<Edge> graph[],boolean isVisited[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if (!isVisited[curr]) {
                System.out.println(curr);
                isVisited[curr]=true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Edge> graph[]=new ArrayList[5];
        boolean isVisited[]=new boolean[5];

        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
       //vertex 0
       graph[0].add(new Edge(0,1,0));
       
       //vertex 1
       graph[1].add(new Edge(1,0,5));
       graph[1].add(new Edge(1,2,1));
       graph[1].add(new Edge(1,3,3));

       //vertex 2
       graph[2].add(new Edge(2,1,1));
       graph[2].add(new Edge(2,3,1));
       graph[2].add(new Edge(2,4,4));

       graph[3].add(new Edge(3,1,3));
       graph[3].add(new Edge(3,2,1));

       graph[4].add(new Edge(4,2,2));

       for (int i = 0; i < graph[2].size(); i++) {
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
       }

    }
}
