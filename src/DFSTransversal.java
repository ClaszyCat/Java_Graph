import java.util.Iterator;
import java.util.LinkedList;

public class DFSTransversal {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    DFSTransversal(int V){
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i ++){
            adj[i] = new LinkedList<Integer>();
        }

    }

    void InsertEdge(int src, int dest){
        adj[src].add(dest);
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if (!visited[n]){
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        DFSTransversal graph = new DFSTransversal(8);

        graph.InsertEdge(0,1);
        graph.InsertEdge(0,2);
        graph.InsertEdge(0,3);
        graph.InsertEdge(1,3);
        graph.InsertEdge(2,4);
        graph.InsertEdge(3,5);
        graph.InsertEdge(3,6);
        graph.InsertEdge(4,5);
        graph.InsertEdge(4,7);
        graph.InsertEdge(5,2);

        System.out.println("Depth First Transversal For The Graph Is: ");
        graph.DFS(0);
    }

}
