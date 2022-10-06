package codechef;

import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		if(t>1000) {
			return;
		}
		if(t<1) {
			return;
		}
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int nums[]=new int[n];
			for(int j=0;j<n;j++ ) {
				nums[j]=sc.nextInt();
			}
			System.out.println(func(nums));
		}

	}

}
