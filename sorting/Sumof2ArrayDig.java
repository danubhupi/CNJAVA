package sorting;

import java.util.Scanner;

public class Sumof2ArrayDig {
	
	public static int SO2AD(int []ar1,int[]ar2) {
		int less=ar1.length<ar2.length?ar1.length-1:ar2.length-1;
		int pow=1,sum=0;
		
		while(less>=0) {
			sum +=(ar1[less]+ar2[less])*pow;
			less--;
			pow*=10;
			
		}
		 less=ar1.length<ar2.length?ar1.length+1:ar2.length+1;
		
		 while(ar1.length-less>=0) {
			 sum+=ar1[ar1.length-less]*pow;
			 pow*=10;
			 less++;
		 }
		 
		 while(ar2.length-less>=0) {
			 sum+=ar2[ar2.length-less]*pow;
			 pow*=10;
			 less++;
		 }
		
		return sum;
		
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
		
		int m=sc.nextInt();
		int [] ar2=new int[m];
		
		for(int i=0;i<m ;i++) {
			ar2[i]=sc.nextInt();
		}
		
		
		System.out.println(SO2AD(ar,ar2)); 
		
		sc.close();
		

	}

}
