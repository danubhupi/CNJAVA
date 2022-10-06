package graphs1;

import java.util.Scanner;

public class HasPathDFS {
	
	public static void helper(int[][]edges,boolean[]visited,int start,int end) {
		
	  if(edges[start][end]==1) {
		  visited[end]=true;
		  return;
	  }
		
		visited[start]=true;
		
		
		for(int i=0;i<edges.length;i++) {
			if(edges[start][i]==1 && !visited[i]) {
				 helper(edges,visited,i,end);
			}
		}
		
		
	}
	
	
	public static boolean hasPath(int[][]edges,int start,int end) {
		boolean visited[]=new boolean [edges.length];
		if(start==end) {
			return true;
		}
		  helper(edges,visited,start,end);
		  return visited[end];
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int vertices=sc.nextInt();
		int totalEdges=sc.nextInt();
		int [][]edges=new int[vertices][vertices];
		
		for(int i=0;i<totalEdges;i++) {
			int firstV=sc.nextInt();
			int secondV=sc.nextInt();
			edges[firstV][secondV]=1;
			edges[secondV][firstV]=1;
			}
		int start=sc.nextInt();
		int end=sc.nextInt();
		
		System.out.println(hasPath(edges,start,end));;
		
	}

}
