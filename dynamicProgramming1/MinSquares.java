package dynamicProgramming1;

import java.util.*;

public class MinSquares {
	
	public static int minSqr(int num,int ar[]) {
		
		
		if(num==0) {
			return 0;
		}
		
		int step=Integer.MAX_VALUE;
		
		for(int i=1;i*i<=num;i++) {
			int ind=num-i*i;
			if(ar[ind]==-1) {
			
			step=Math.min(step, minSqr(ind,ar));
			}
			else
			{
				step=Math.min(step, ar[ind]);
				
			}
		}
		
		ar[num]=step+1;
		
		return ar[num];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		if(n==1) {
//			System.out.println(1);
//			return;
//		}
		
		int ar[]=new int[n+1];

		 Arrays.fill(ar, -1);
		 ar[1]=1;
//		 ar[2]=1;
		
		System.out.println(minSqr(n,ar));
	}

}
