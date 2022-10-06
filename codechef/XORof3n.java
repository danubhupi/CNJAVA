package codechef;

import java.util.Arrays;
import java.util.Scanner;


public class XORof3n {
	
	public static boolean func(int ar[],int n ,int num,int ind) {
//		if()
//		System.out.println(num);
		if(n%2==0) {
			System.out.println(0+" "+0+" "+n/2);
			return true;
		}
		if(num>n) {
			return false;
		}
		if(ar[2]!=-1) {
			if((ar[0]^ar[1]) + (ar[0]^ar[2]) + (ar[1]^ar[2])==n) {
//				System.out.println(n);
				
				Arrays.sort(ar);
				for(int i:ar) {
					System.out.print(i+" ");
				}
				System.out.println("");
				return true;
			}
			else return false;
		}
		ar[ind]=num;
		boolean include=func(ar,n,num,ind+1);
		if(include) {
			return true;
		}
		else if(func(ar,n,num+1,ind+1)){
		return true;
		
		}else {
		ar[ind]=-1;
		boolean notInclude=func(ar,n,num+1,ind);
		if(notInclude) {
			return true;
		}
//		System.out.println(ar);
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		if(t>10000) {
			return;
		}
		if(t<1) {
			return;
		}
		
//		int n;
		for(int i=0;i<t;i++) {
			
			int n=sc.nextInt();
			if(n>Math.pow(10, 9)) {
				return;
			}
			int ar[]=new int[3];
			
			Arrays.fill(ar, -1);
			
			if(func(ar,n,0,0)==false) {
				System.out.println(-1);
			}
		}

	}

}
