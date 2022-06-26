package dynamicProgramming2;

import java.util.Scanner;
import java.util.*;

public class MinCostIDP {
	public static int minCost(int [][]path) {
		int res[][]=new int[path.length][path[0].length];
		res[0][0]=path[0][0];
		for(int i=1;i<path[0].length;i++) {
			res[0][i]=path[0][i]+res[0][i-1];
		}
		for(int i=1;i<path.length;i++) {
			res[i][0]=path[i][0]+res[i-1][0];
		}
		
		for(int i=1;i<path.length;i++) {
			for(int j=1;j<path[0].length;j++) {
				res[i][j]=path[i][j]+Math.min(res[i-1][j], Math.min(res   [i][j-1], res[i-1][j-1]));
			}
		}
		
		return res[path.length-1][path[0].length-1];
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
		System.out.println(minCost(path));

	}

}
