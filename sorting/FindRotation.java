package sorting;

import java.util.Scanner;

public class FindRotation {

	
	public static int FS(int[] ar) {
		int i=0;
		for(;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
				break;
			}
		}
		
		if(i==ar.length-1) {
			return 0;
		}
		else 
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner (System.in);
			
			int n=sc.nextInt();
			int [] ar=new int[n];
			
			for(int i=0;i<n ;i++) {
				ar[i]=sc.nextInt();
			}
			System.out.println(FS(ar));
			sc.close();
		
		

	}

}
