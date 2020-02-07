import java.util.*;

public class TopologicalSort{
	public void topologicalSort(int v){
		boolean [] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();

	}

	public void topologicalSortUtil(int x, boolean[] visited, Stack<Integer> stack) {
            visited[x] = true;
            for (int i = 0; i < ; i++) {
               
                if (!visited[v])
                    topologicalSortUtil(v, visited, stack);
            }
            stack.push(x);
        }
}