package arrays;

import java.util.Scanner;

public class FidIntersection {
	
	public static int[] fI(int [] n,int[] m) {
		
		int[] res=new int[n.length>m.length?m.length:n.length];
		res[0]=1;
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<m.length;j++) {
				if(n[i]==m[j]) {
					res[res[0]]=n[i];
					res[0]++;
				}
				
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
		 ar[i]=sc.nextInt();
		}
		
		int n2=sc.nextInt();
		int[] ar2=new int[n];
		
		for(int i=0;i<n2;i++) {
		 ar2[i]=sc.nextInt();
		}
		
		int []res=fI(ar,ar2);
		
		for(int i=1;i<res[0];i++) {
			System.out.println(res[i]);
		}

	}

}
