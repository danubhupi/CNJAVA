package arrays;

import java.util.Scanner;

public class PairSum {
	
	
	
	public static int  findPairs (int[] a ,int sum) {
		
		int res=0;
		
		for (int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(sum==a[i]+a[j]) {
					
					
					res++;
				}
				
				
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		
		
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		
		int k=sc.nextInt();
		
		
		int res=findPairs(ar,k);
		
		System.out.println(res);

	}

}
