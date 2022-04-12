package sorting;

import java.util.Scanner;

public class Push0ToEnd {
	
	
	public static void print(int [] ar) {
		
		for(int i:ar) {
			System.out.println(i);
		}
		
	}
	
	public static void P2E(int []a) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				for(int j=i+1;j<a.length;j++) {
					if(a[j]!=0) {
						int temp=a[j];
						a[j]=0;
						a[i]=temp;
						break;
					}
				}
			}
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
		P2E(ar);
		print(ar);
		
		

	}

}
