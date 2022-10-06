package dynamicProgramming2;

import java.util.Arrays;
import java.util.Scanner;

public class LCS_IDP {
	
	public static int LCSIDP(String s1,String s2) {
		//array to store length of subsequence at any index combination
		int dp[][]=new int[s1.length()][s2.length()];
		
//		for(int i=0;i<)
//		Arrays.fill(dp, -1);
//		
		// put value of base cases in DP arrray
		//if length of any string is 0 then longest subsequence 
		//length is also 0
//		for(int i=0;i<s1.length();i++) {
//			dp[i][0]=0;
//		}
//		for(int i=0;i<s2.length();i++) {
//			dp[0][i]=0;
//		}
		
		
		//using loop to iterate over every combination of indexes
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				
				if(i==0||j==0) {
					dp[i][j]=0;
					continue;
				}
				
			    //if char at current posisiton are same then
				// at that place max subsequence length increases by 1
				// max subsequence length is max length at all the poins we 
				//could have used to get to this point
				if(s1.charAt(i)==s2.charAt(j)) {
					dp[i][j]=1+ Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
				}
				else 
				{
					//if chars are not same then max length at that point
					//equals max length between his   predecessors 
					dp[i][j]=Math.max(dp[i-1][j-1], Math.max(dp[i-1][j], dp[i][j-1]));
				}
				
			}
		}
		
		return dp[s1.length()-1][s2.length()-1];
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(LCSIDP(s1,s2));
		sc.close();

	}

}
