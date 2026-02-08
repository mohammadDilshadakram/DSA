import java.util.*;
public class implementation(){

    public static void addEdge(int u, int v,ArrayList<Integer>grapgh[]){
        grapgh[u].add(v);
        grapgh[v].add(u);
    }

    public static void print(ArrayList<Integer>grapgh[]){
        for (int i = 0; i < grapgh[2].size(); i++) {
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> grapgh[]=new ArrayList[4];

        for (int i = 0; i < grapgh.length; i++) {
            grapgh[i]=new ArrayList<>();
        }

        addEdge(grapgh, 1, 2);
        addEdge(grapgh, 1, 0);
        addEdge(grapgh, 2, 0);
        addEdge(grapgh, 2, 3);
        addEdge(grapgh, 2, 4);

    }
}