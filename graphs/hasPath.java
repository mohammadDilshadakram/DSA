import java.util.*;

public class hasPath {
    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static boolean checkPath(int src, int dest, boolean visited[], ArrayList<Edge> grapgh[]) {
        if (src == dest) {
            return true;
        }

        visited[src]=true;

        for (int j = 0; j < grapgh[src].size(); j++) {
            Edge e = grapgh[src].get(j);
            if (!visited[e.dest] && checkPath(e.dest, dest, visited,grapgh)) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Edge> graph[] = new ArrayList[6];
        boolean visited[] = new boolean[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 10));
        graph[1].add(new Edge(1, 3, 30));
        graph[3].add(new Edge(3, 4, 40));
        graph[4].add(new Edge(4, 5, 50));

        
        if (checkPath(0, 5, visited, graph)) {
            System.out.println("Path exists");
        } else {
            System.out.println("Path does not exist");
            
        }

    }
}