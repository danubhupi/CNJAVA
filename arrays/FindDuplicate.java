package arrays;

import java.util.Scanner;

public class FindDuplicate {
	
	public static int dupli(int[] arr) {
		int k=0;
		
		    int[] counts=new int[arr.length];
		    
		    for(int i=0;i<arr.length;i++) {
		    	counts[arr[i]]++;
		    }
		    
		    for(int i=0;i<arr.length;i++) {
		    	if(counts[i]>1) {
		    		k=i;
		    	}
		    	
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
    System.out.println(dupli(ar));
	}

}
