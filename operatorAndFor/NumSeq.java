package operatorAndFor;

import java.util.*;
public class NumSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int seq[]=new int[n];
		int i=0;
		while(i<n) {
			seq[i]=sc.nextInt();
			i++;
		}
		
		i=0;
		while( i+1<n && seq[i]>seq[i+1] ) {
			i++;
		}
		while(i+1 <n  && seq[i]<seq[i+1] ) {
			i++;
		}
		if(i+1==n) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
