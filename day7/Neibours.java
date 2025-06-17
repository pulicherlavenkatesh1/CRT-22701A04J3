import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        Graph graph = new Graph(4, true); // Provide both parameters
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(3, 0);
        graph.printGraph();

        // Optional: print neighbors of a node
        System.out.println("Neighbors of node 0: " + graph.neibours(0));
    }
}

class Graph {
    int[][] graph;
    int vertices;
    boolean isDirected;

    Graph(int vertices, boolean isDirected) {
        graph = new int[vertices][vertices];
        this.vertices = vertices;
        this.isDirected = isDirected;
    }

    void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph[src][dest] = 1;
            if (!isDirected) {
                graph[dest][src] = 1;
            }
        } else {
            System.err.println("Invalid source and destination");
        }
    }

    void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph[src][dest] = 0;
            if (!isDirected) {
                graph[dest][src] = 0;
            }
        } else {
            System.err.println("Invalid source and destination");
        }
    }

    boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices && src != dest;
    }

    void printGraph() {
        System.out.println("Matrix representation of Graph:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> neibours(int node) {
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            if (graph[node][i] == 1) {
                n.add(i);
            }
        }
        return n;
    }
}
