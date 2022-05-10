package sorting;

import java.util.Scanner;

public class Sort012s {
	
	public static void S012(int[]ar) {
		
		int current=0,zeroPos=0,twoPos=ar.length-1;
		
		while(current<=twoPos) {
			if(ar[current]==0) {
				ar[current]=ar[zeroPos];
				ar[zeroPos]=0;
				current++;
				zeroPos++;
			}
			else if(ar[current]==1) {
				current++;
			}
			else {
				ar[current]=ar[twoPos];
				ar[twoPos]=2;
				twoPos--;
			}
		}
		
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
			S012(ar);
			print(ar);
			sc.close();

	}

}
