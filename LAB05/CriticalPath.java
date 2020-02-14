import java.io.*; 
import java.util.*; 

public class CriticalPath{

	public int vertices;
	public LinkedList<Node> array [];

	public class Node{
		public int vertex;
		public int weight;

		public Node(int a, int b){
			vertex = a;
			weight = b;
		}

		public int getVertex(){
			return vertex;
		} 
		
		public int getWeight(){
			return weight;
		}
	}

	public class DAG{

		public int vertices;
		public LinkedList<Node> array[];

		public DAG(int v){
			vertices = v;
			array = new LinkedList[vertices];
			for(int i=0; i<v; ++i){
				array[i] = new LinkedList<Node>();
			}
		}

		public void addEdge(int a, int b, int weight){
			Node node = new Node(b,weight);
			array[a].add(node);
		}

	}

	public DAG newGraph(int number) 
	{ 
		return new DAG(number); 
	} 

	public class findCriticalPath{
		public void findCriticalPath(DAG G){
			Queue <Integer> queue = new LinkedList<Integer>();

		}
	}		

	public static void main(String [] args){
		CriticalPath cp = new CriticalPath();
		DAG g = cp.newGraph(7);


	}
}