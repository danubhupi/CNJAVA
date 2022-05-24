package dynamicProgramming1;

public class MST1CN {
	
public static int min(int n) {
		
		int []dp=new int[n+1];
		dp[0]=Integer.MAX_VALUE;
		dp[1]=0;
		for(int i=2;i<n+1;i++) {
			int sub1=dp[n-1];
			int div2=Integer.MAX_VALUE;
			int div3=Integer.MAX_VALUE;
			if(i%2==0) {
				div2=dp[i/2];
				
			}
			 if(i%3==0) {
				div3=dp[i/3];
			}
			dp[i]=1+Math.min(sub1,Math.min(div2, div3));
			
			
		}
		return dp[n];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
