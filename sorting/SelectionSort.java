package sorting;

import java.util.Scanner;

public class SelectionSort {
	
	public static void SS(int[] ar) {
		
		for(int i=0;i<ar.length-1;i++) {
			int temp=ar[i],ind=i;
			for(int j=i+1;j<ar.length;j++) {
				if(temp>ar[j]) {
					temp=ar[j];
					ind=j;
//					System.out.println(temp +" str");
				}
			}
			
			temp=ar[i];
			ar[i]=ar[ind];
			ar[ind]=temp;
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
		
		SS(ar);
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
	

	}

}
