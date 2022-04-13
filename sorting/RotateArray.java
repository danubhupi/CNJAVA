package sorting;

import java.util.Scanner;

public class RotateArray {
	
	
	public static void reverse(int ar[],int index,int start) {
		
		
		int n=index;

	while(start<n) {
		
		int temp=ar[start];
		ar[start]=ar[n];
		ar[n]=temp;
		start++;
		n--;
	}
		
	}

	public static void RA(int [] ar,int r) {
		
		// brute force
		
//		for(int i=0;i<r;i++) {
//			int temp=ar[0],j=0;
//			for(j=0;j<ar.length-1;j++) {
//				ar[j]=ar[j+1];
//			}
//			ar[j]=temp;
//		}
		
		//Reverse part of arrays
		int n=ar.length;
		

		reverse(ar,ar.length-1,0);
		reverse(ar,n-r-1,0);
		reverse(ar,n-1,n-r);
		
		
		print(ar);
		
	}
	
	

	public static void print(int [] ar) {
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc=new Scanner (System.in);
		
		int n=sc.nextInt();
		int [] ar=new int[n];
		
		for(int i=0;i<n ;i++) {
			ar[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		RA(ar,r);
		sc.close();

	}

}
