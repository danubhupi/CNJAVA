package recursion3;

import java.util.Scanner;

public class MinCostPath {
	
	public static int minCost(int[][] path,int i,int j) {
		int right=Integer.MAX_VALUE;
		int down=Integer.MAX_VALUE;
		int diagonal=Integer.MAX_VALUE;
		if(i==path.length-1&&j==path[i].length-1) {
			return path[i][j];
		}
		if(i<path.length-1) {
			right=minCost(path,i+1,j);
		}
		if(j<path[0].length-1) {
			down=minCost(path,i,j+1);
			
		}
		if(i<path.length-1&&j<path[0].length-1) {
			diagonal=minCost(path,i+1,j+1);
		}
		
		return path[i][j]+ Math.min(right,Math.min(down, diagonal));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int path[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				path[i][j]=sc.nextInt();
			}
		}
		System.out.println(minCost(path,0,0));

	}

}
