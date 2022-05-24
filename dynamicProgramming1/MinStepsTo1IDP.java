package dynamicProgramming1;

public class MinStepsTo1IDP {

	
	public static int min(int n) {
		
		int []dp=new int[n+1];
		dp[0]=Integer.MAX_VALUE;
		dp[1]=0;
		for(int i=2;i<n+1;i++) {
			if(i%2==0) {
				dp[i]=1+Math.min(dp[i/2], dp[i-1]);
				
			}
			else if(i%3==0) {
				dp[i]=1+Math.min(dp[i/3], dp[i-1]);
			}
			else {
				dp[i]=1+ dp[i-1];
			}
			
			
		}
		return dp[n];
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(min(13));

	}

}
