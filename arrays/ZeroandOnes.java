package arrays;

import java.util.*;

public class ZeroandOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		int nextZero=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==0) {
				int temp=ar[nextZero];
				ar[nextZero]=ar[i];
				ar[i]=temp;
				nextZero++;
			}
		}
		
		for(int i=0;i<n;i++) {
			 System.out.println(ar[i]);
			}

	}

}
