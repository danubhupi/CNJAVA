package graphs1;
import java.util.*;

import java.util.Scanner;

public class GetPathDFS {
	
	public static ArrayList<Integer> helper(int [][]edges,boolean []visited,int start,int end,ArrayList<Integer> path){
		path.add(start); 
		if(start==end) {
			
			return path;
		}
		visited[start]=true;
		ArrayList<Integer> current=new ArrayList<Integer>();
		ArrayList<Integer> temp=new ArrayList<Integer>();
		
		for(int i=0;i<edges.length;i++) {
            if(edges[start][i]==1 && !visited[i]) {
            	temp=helper(edges,visited,i,end,path);
            }
            if(temp!=null) {
            	current=temp;
            	return current;
            }
			
		}
		
		return current;
	}
	
	public static void print(ArrayList<Integer>path) {
		System.out.println("yo:"+path.size());
		for(int i:path) {
			System.out.print(i+" ");
		}
	}
	
	public static void getPath(int[][]edges,int start,int end) {
		ArrayList<Integer> path=new ArrayList<Integer>();
		boolean [] visited=new boolean[edges.length];
		
		path=helper(edges,visited,start,end,path);
		if(path==null) {
			System.out.println("no path");
			return;
		}
		print(path);
		
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
		getPath(edges,start,end);

	}

}
