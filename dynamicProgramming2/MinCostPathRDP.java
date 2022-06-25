package dynamicProgramming2;

import java.util.Arrays;
import java.util.Scanner;

public class MinCostPathRDP {
	public static int minCost(int[][]path,int i,int j,int [][]res ) {
		
		if(i==path.length-1 && j==path[0].length-1) {
			res[i][j]=path[i][j];
			return res[i][j];
		}
		int right=Integer.MAX_VALUE;
		int down=Integer.MAX_VALUE;
		int diagonal=Integer.MAX_VALUE;
		if(i<path.length-1) {
			right=res[i+1][j]!=-1?res[i+1][j]:minCost(path,i+1,j,res);

		}
		if(j<path[0].length-1) {
			down=res[i][j+1]!=-1?res[i][j+1]:minCost(path,i,j+1,res);

		}
		if(j<path[0].length-1 && i<path.length-1) {
			down=res[i+1][j+1]!=-1?res[i+1][j+1]:minCost(path,i+1,j+1,res);

		}
		
		res[i][j]=path[i][j]+Math.min(right, Math.min(down, diagonal));
		
		
		return res[i][j];
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
		int res[][]=new int[n][m];
		for(int i=0;i<n;i++) {
		Arrays.fill(res[i], -1);}
//		res[0][0]=path
		System.out.println(minCost(path,0,0,res));

	}

}
