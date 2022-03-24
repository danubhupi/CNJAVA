package arrays;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void swapping(int[] arr )   {
		
		for(int i=0;i<arr.length-1;i+=2) {
			int emp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=emp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		
		swapping(ar);
		
		for(int i=0;i<n;i++) {
			 System.out.println(ar[i]+ " ");
			}
		

	}

}
