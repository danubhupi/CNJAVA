package dynamicProgramming1;

import java.util.*;

public class MinSquaresIDP {
	
	public static int minSqr(int num) {
		int dp[]=new int[num+1];
		
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<num+1;i++) {
			for(int j=1;j*j<=i;j++) {
				dp[i]=Math.min(dp[i],1+dp[i-j*j]);
			}
		}
		return dp[num];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(minSqr(n));

	}

}
