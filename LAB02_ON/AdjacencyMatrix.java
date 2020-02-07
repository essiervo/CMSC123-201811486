import java.util.*;

public class AdjacencyMatrix{
	Scanner scan = new Scanner(System.in);
	int vertex, v1, v2, n, j = 0;
	int [][] graph, temp;
	Boolean element;

	public AdjacencyMatrix(int vertex){
		this.graph = new int[vertex][vertex];
		this.vertex = vertex;
	}

	public int [][] getGraph(){
		return graph;
	}

	public int getNumberOfVertices(){
		return graph.length;
	}

	public int getNumberOfEdges(){
		int num = 0;
		for(int i=1; i<graph.length; i++){
			if(graph[i-1][i]==1){
				num++;
			}
		}
		return num;
	}

	public void vertexAdjacent(int vertex){
		if(vertex >= graph.length || vertex < 0){
			System.out.println("Vertex not present!");
			return;
		}

		System.out.print("Vertices adjacent to a given vertex: ");
		for(int i=0; i<graph.length; i++){
			if(graph[vertex][i] == 1 && graph[i][vertex] == 1){
				System.out.print(i + " ");
				j++;
			}
		}
		
		if(j==0){
			System.out.println("NONE");
			return;
		}

		System.out.print("\n");
	}

	public void twoAdjVertex(int vertex1, int vertex2){
		if(vertex1 >= graph.length || vertex1 < 0 || vertex2 >= graph.length || vertex2 < 0){
			System.out.println("Vertex not present!");
			return;
		}

		if(graph[vertex1][vertex2] == 1 && graph[vertex2][vertex1] == 1)
			System.out.print("The two vertices are adjacent!\n");
		else
			System.out.print("The two vertices are NOT adjacent!\n");	
	}

		/*public void twoConnectedVertices(int vertex1, int vertex2, int num){
		if(graph[vertex1][num] != 1){
			twoConVertex(vertex1, num++, )
		}
	}*/


	public void insertingEdge(){
		n = graph.length;
		System.out.print("1st vertex: ");
		v1 = scan.nextInt();

		if(v1>=n || v1<0){ 
            System.out.println("Vertex not present!"); 
            return; 
        }

		System.out.print("2nd vertex: ");
		v2 = scan.nextInt();

		if(v2>=n || v2<0){ 
            System.out.println("Vertex not present!"); 
            return; 
        }

		graph[v1][v2] = 1;
		graph[v2][v1] = 1;
	}

	public void removingEdge(){
		System.out.print("1st vertex: ");
		v1 = scan.nextInt();

		if(v1>n || v1<0){ 
            System.out.println("Vertex not present!"); 
            return; 
        }

		System.out.print("2nd vertex: ");
		v2 = scan.nextInt();

		if(v2>n || v2<0){ 
            System.out.println("Vertex not present!"); 
            return; 
        }

		graph[v1][v2] = 0;
		graph[v2][v1] = 0;
	}

	public void showGraph(){
		System.out.print("UGraph \n");
		for(int i=0; i<graph.length; i++){
			System.out.print("[ ");
			for(int j = 0; j<graph[i].length; j++){
				System.out.print(graph[i][j] + " ");
			}
			System.out.print("]\n");
		}
	}

	/*public void depthFirst(int vertex){
		Stack<Integer> stack = new Stack<Integer>();
	    boolean [] isVisited = new boolean[graph.length];
		stack.push(vertex);

		while (stack.empty() == false){
			int x = stack.pop();
			if(!element.visited){
				System.out.print(element.data + " ");
				element.visited=true;
			}

			//List<Integer> adjacent = element.get
		}		
	}*/


	public void breadthFirst(){
		Queue<Integer> queue = new LinkedList<Integer>();
	}

	public void insertVertex(){
		n = graph.length;
		n++;
		this.graph = new int[n][n];
        
        for(int i=0; i<n; i++){ 
            graph[i][n-1] = 0; 
            graph[n-1][i] = 0; 
        } 
    } 
  
    public void removeVertex(int vertex){
    	n = graph.length;
    	if(vertex>n){ 
            System.out.println("Vertex not present!"); 
            return; 
        }
        
        //temp = new int[n][n];
      
        while(vertex<n){
            // shifting the rows to left side 
            for(int i=0; i<n; i++){
            	if(vertex+1<n){
               		graph[i][vertex] = graph[i][vertex+1]; 
               	}  
            } 
  				
  			// shifting the columns upwards
            for(int i=0; i<n ; i++){ 
            	if(vertex+1<n){
                	graph[vertex][i] = graph[vertex+1][i];
           	 	}
            }
            vertex++;
        }

        temp = new int[n-1][n-1];

        for(int i=0; i< temp.length ; i++){
        	for(int j=0; j< temp[i].length ; j++){
        		temp[i][j] = graph[i][j];
        	}
        }

        this.graph = new int[n-1][n-1];
        this.graph = temp;
    }
}

/*
 for(int i=0; i<graph.length; i++){
			System.out.print("[ ");
			for(int j = 0; j<graph[i].length; j++){
				System.out.print(graph[i][j] + " ");
			}
			System.out.print("]\n");
		}*/