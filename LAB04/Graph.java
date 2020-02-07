import java.io.*;
import java.util.*;

public class Graph{
    public int numOfVertices;
    public LinkedList <Integer> adjList [];

    public void Graph(int v){
        numOfVertices = v;
        adjList = new LinkedList[v];

        for(int i = 0; i<v ; ++i){
            adjList[i] = new LinkedList();
        }
    }

    public int getNumOfVertices(){
        return numOfVertices;
    }

    public void addingEdge(int x, int y){
        adjList[x].add(y);
    }

    public void removingEdge(){}
}

/*
        public void topologicalSorting() {
            boolean[] visited = new boolean[vertices];
            Stack<Integer> stack = new Stack<>();
            //visit from each node if not already visited
            for (int i = 0; i < vertices; i++) {
                if (!visited[i]) {
                    topologicalSortUtil(i, visited, stack);
                }
            }
            System.out.println("Topological Sort: ");
            int size = stack.size();
            for (int i = 0; i <size ; i++) {
                System.out.print(stack.pop() + " ");
            }
        }

        public void topologicalSortUtil(int start, boolean[] visited, Stack<Integer> stack) {
            visited[start] = true;
            for (int i = 0; i < adjList[start].size(); i++) {
                int vertex = adjList[start].get(i);
                if (!visited[vertex])
                    topologicalSortUtil(vertex, visited, stack);
            }
            stack.push(start);
        }
*/






/*
public  void toplogicalSort(Node node)
    {
        List<Node> neighbours=node.getNeighbours();
        for (int i = 0; i < neighbours.size(); i++) {
            Node n=neighbours.get(i);
            if(n!=null && !n.visited)
            {
                toplogicalSort(n);
                n.visited=true;
            }
        }
        stack.push(node);
    }*/