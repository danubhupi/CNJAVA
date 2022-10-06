package graphs1;

import java.util.Scanner;

public class DFS {
	
	public static void printHelper(int[][]edges,boolean [] visited,int start) {
		System.out.println(start);
		visited[start]=true;
		
		for(int i=0;i<edges.length;i++) {
			if(edges[start][i]==1) {
			if(!visited[i]) {
				printHelper(edges,visited,i);
			}
		}
		}
	}
	
	public static void print(int[][]edges) {
		boolean visited[]=new boolean[edges.length];
		//this loop is for going to components (unconnected part of graphs)
		for(int i=0;i<edges.length;i++) {
			//if a vertex has not been visited
			if(!visited[i]) {
			//will print all vertex cnnected to i which have not
				//been printed
		printHelper(edges,visited,i);
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
		print(edges);

	}


}
