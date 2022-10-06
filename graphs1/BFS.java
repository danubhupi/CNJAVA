package graphs1;
import java.util.*;

public class BFS {
	
	public static void printHelper(int[][]edges,int currentElement,boolean[] visited,Queue bfs) {
		System.out.println(currentElement);
		visited[currentElement]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[currentElement][i]==1) {
				if(!visited[i]) {
					bfs.add(i);
				}
			}
		}
	}
	
	
	public static void print(int[][]edges,int start) {
		Queue<Integer> bfs=new LinkedList<>();
		boolean visited[]=new boolean[edges.length];
		
		
		//this loop is for going to components (unconnected part of graphs)
		for(int i=0;i<visited.length;i++) {
			if(!visited[i]) {
				bfs.add(i);
				  
				while(bfs.size()!=0) {
					if(!visited[bfs.peek()]) {
						printHelper(edges, bfs.peek(),visited,bfs);
						bfs.remove();
						
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int vertices=sc.nextInt();
		int totalEdges=sc.nextInt();
		int[][]edges=new int[vertices][vertices];
		for(int i=0;i<totalEdges;i++) {
			int firstV=sc.nextInt();
			int secondV=sc.nextInt();
			edges[firstV][secondV]=1;
			edges[secondV][firstV]=1;
		}
		print(edges,0);

	}

}
