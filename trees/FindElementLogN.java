package trees;

import java.util.Scanner;

public class FindElementLogN {
	
	public static int logN(int[]ar) {
		int count=ar.length/2;
		int low=1,high=count-1,ans=ar[0];
		while(low<=high) {
			int mid=(low+high)/2;
			int index=mid*2;
			if(index>0 && ar[index]!=ar[index-1]) {
				ans=ar[index];
				low=mid+1;
				
				
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println(logN(ar));

	}

}
