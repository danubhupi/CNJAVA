package sorting;

import java.util.Scanner;

public class SecondLargest {
	
	public static int SL(int []ar) {
		int ind=0,res=-2147483648;
		for(int i=0;i<ar.length-1;i++) {
			int cur=ar[i];
			ind =i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j]>cur) {
					cur=ar[j];
					ind=j;
				}			
				
			}
			if(ind!=i) {
				int temp=ar[i];
				ar[i]=ar[ind];
				ar[ind]=temp;
				
			}
			if(i>0 && ar[i]!=ar[i-1]) {
				res=ar[i];
				break;
			}
		}

		return res;
	}
	
	public static int SLCN(int[] ar) {
		 int largest=ar[0],secondL=Integer.MIN_VALUE;
		 
		 for(int i=1;i<ar.length;i++) {
			 if(largest<ar[i]) {
				 secondL=largest;
				 largest=ar[i];
				 
			 }
			 else if(secondL<ar[i]&& largest!=ar[i]) {
				 secondL=ar[i];
			 }
			 
		 }
		
		return secondL;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	      Scanner sc=new Scanner (System.in);
			
			int n=sc.nextInt();
			int [] ar=new int[n];
			
			for(int i=0;i<n ;i++) {
				ar[i]=sc.nextInt();
			}
			System.out.println(SLCN(ar));
			sc.close();

	}

}
