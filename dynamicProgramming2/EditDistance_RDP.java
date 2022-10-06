package dynamicProgramming2;

public class EditDistance_RDP {
	
	public static int ed(String s1,String s2,int m,int n,int[][]dp) {
		if(s1.equals("")) {
			return dp[0][n];
		}
		if(s2.equals("")) {
			return dp[m][0];
		}
		
		if(s1.charAt(0)==s2.charAt(0)) {
			if(dp[m+1][n+1]!=-1) {
				return dp[m+1][n+1];
			}
			else 
			{
				dp[m+1][n+1]=ed(s1.substring(1),s2.substring(0),m+1,n+1,dp);
				return dp[m+1][n+1];
			}
		}
		
		int deletion;
		if(dp[m+1][n]!=-1) {
			deletion=dp[m+1][n];
		}
		else {
			deletion=ed(s1.substring(1),s2,m+1,n,dp);
			dp[m+1][n]=deletion;
		}
		int insertion;
		if(dp[m][n+1]!=-1) {
			insertion=dp[m][n+1];
		}
		else {
			insertion=ed(s1,s2.substring(1),m,n+1,dp);
			dp[m][n+1]=insertion;
		}
		int replace;
		if(dp[m+1][n+1]!=-1) {
			replace=dp[m+1][n+1];
		}
		else {
			replace=ed(s1.substring(1),s2.substring(1),m+1,n+1,dp);
			dp[m+1][n+1]=replace;
		}
		dp[m][n]= 1+ Math.min(replace, Math.min(insertion,deletion));
		
		return dp[m][n];
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
