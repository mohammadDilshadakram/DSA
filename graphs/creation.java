import java.util.ArrayList;

public class creation {
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
        
    public static void main(String[] args) {
       
       ArrayList<Edge> arr[]=new ArrayList[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new ArrayList<>();
        }
       //vertex 0
       arr[0].add(new Edge(0,1,0));
       
       //vertex 1
       arr[1].add(new Edge(1,0,5));
       arr[1].add(new Edge(1,2,1));
       arr[1].add(new Edge(1,3,3));

       //vertex 2
       arr[2].add(new Edge(2,1,1));
       arr[2].add(new Edge(2,3,1));
       arr[2].add(new Edge(2,4,4));

       arr[3].add(new Edge(3,1,3));
       arr[3].add(new Edge(3,2,1));

       arr[4].add(new Edge(4,2,2));

       for (int i = 0; i < arr[2].size(); i++) {
            Edge e=arr[2].get(i);
            System.out.println(e.dest);
       }

       
    }
}
