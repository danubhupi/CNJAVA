package dynamicProgrammin1;

import java.util.Scanner;

public class MinStepsTo1 {
	
	public static int min(int n,int[]ans) {
		if(n==1) {
			return 0;
		}
		if(n<1) {
			return Integer.MAX_VALUE;
		}
		int curAns;
		
		if(n%2==0) {
			if(ans[n%2]!=-1 && ans[n-1]!=-1) {
				curAns=1+Math.min(ans[n/2], ans[n-1]);}
			
				else {curAns=1+Math.min(min(n/2,ans), min(n-1,ans));
				
	
				}
				
			}
		
		
		else if(n%3==0) {
			if(ans[n%3]!=-1 && ans[n-1]!=-1) {
				curAns=1+Math.min(ans[n/3], ans[n-1]);
			}
				else {
					curAns=1+Math.min(min(n/2,ans), min(n-1,ans));
				
	
				}
				
			}
	
		
		else if(ans[n-1]!=-1)
			{
			curAns=1+ans[n-1];
			}
		else curAns=1+min(n-1,ans);
		
		ans[n]=curAns;
		return curAns;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubnt [] ans
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] ans=new int[n+1];
		ans[0]=Integer.MAX_VALUE;
		ans[1]=0;
		for(int i=2;i<n+1;i++) {
			ans[i]=-1;
		}
		System.out.println(min(n,ans));

	}

}
