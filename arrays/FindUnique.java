package arrays;

import java.util.Scanner;

public class FindUnique {
	
	
	public static int unique(int [] arr) {
		int k=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			k^=arr[i];
		}
		
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		
		System.out.println(unique(ar));
		
		

	}

}
