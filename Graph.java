import java.util.ArrayList;
import java.util.List;

public class Graph {
    ArrayList<ArrayList<Integer>> list = new ArrayList();
  //  private List<List<Integer>> adjacencyList;

    
    public Graph(int v) {
        list = new ArrayList<>();
         for (int i = 0; i <v; i++) {
            list.add(new ArrayList<>());
        }
    }

    
    public void addEdge(int i, int j) {
        list.get(i).add(j);
        list.get(j).add(i); 
    }

    
    public void printGraph() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int neighbor : list.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
