import java.util.Scanner;

public class UGraph{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int choice, choice2, v, v1, v2;

		System.out.print("Enter number of vertices: ");
		v = scan.nextInt();

		AdjacencyMatrix adjMatrix = new AdjacencyMatrix(v);

		//adjMatrix.showGraph();

		do{
			System.out.print("\n1. Inquire \n2. Modify \n3. Traverse \n4. Show Matrix \n5. Exit");
			System.out.print("\n\nEnter choice: ");

			choice = scan.nextInt();

			switch(choice){
				case 1:
					do{
						System.out.print("\n1. Number of vertices \n2. Number of edges \n3. Vertices adjacent to a given vertex \n4. Are two vertices adjacent? \n5. Are two vertices connected? \n6. Back");
						System.out.print("\n\nEnter choice: ");
						choice = scan.nextInt();
			
						switch(choice){
							case 1:
								System.out.print("Number of vertices: " + adjMatrix.getNumberOfVertices() + "\n");
								break;

							case 2:
								System.out.print("Number of edges: " + adjMatrix.getNumberOfEdges() + "\n");
								break;

							case 3:
								System.out.print("Vertex: ");
								v = scan.nextInt();
								adjMatrix.vertexAdjacent(v);
								break;

							case 4:
								System.out.print("1st Vertex: ");
								v1 = scan.nextInt();
								System.out.print("2nd Vertex: ");
								v2 = scan.nextInt();
								adjMatrix.twoAdjVertex(v1, v2);
								break;

							case 5:

								break;
						}
					}while(choice != 6);
					break;

				case 2:
					do{
						System.out.print("\n1. Insert an edge \n2. Remove an edge \n3. Insert a vertex \n4. Remove a vertex \n5. Back");
						System.out.print("\n\nEnter choice: ");
						choice2 = scan.nextInt();
			
						switch(choice2){
							case 1:
								adjMatrix.insertingEdge();
								break;

							case 2:
								adjMatrix.removingEdge();
								break;

							case 3:
								adjMatrix.insertVertex();
								break;

							case 4:
								System.out.print("Enter vertex you want to remove: ");
								adjMatrix.removeVertex(scan.nextInt());
								break;
						}
					}while(choice2 != 5);
					break;

				case 3:
					do{
						System.out.print("\n1. Depth-First Search \n2. Breadth-First Search \n3. Exit");
						System.out.print("\n\nEnter choice: ");
						choice = scan.nextInt();
			
						switch(choice){
							case 1:
								
							case 2:
									
						}
					}while(choice!=3);
					break;

				case 4: 
					adjMatrix.showGraph();
					break;
			}
		}while(choice != 5);
	}
}



