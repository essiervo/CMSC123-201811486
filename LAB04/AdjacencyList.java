import java.util.*;

public class AdjacencyList{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		TopologicalSort topoSort = new TopologicalSort();
		int v, v1, v2, choice;

		System.out.print("Enter number of vertices: ");
		v = scan.nextInt();

		Graph graph = new Graph();

		do{
			System.out.print("\n1. Add an edge \n2. Topological Sort \n3. Exit");
			choice = scan.nextInt();

			switch(choice){
				case 1:
					System.out.print("Enter vertex1: ");
					v1 = scan.nextInt();
					System.out.print("Enter vertex2: ");
					v2 = scan.nextInt();

					if(v1>=v || v1<0 || v2>=v || v2<0){
						System.out.println("Vertex not present!"); 
					   	continue;
					}
					graph.addingEdge(v1, v2);
					break;

				case 2:
					v = topoSort.getNumOfVertices();
					topoSort.topologicalSort(v);					
			}
		}while(choice!=3);
	}
}