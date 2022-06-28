package recursion3;

import java.util.Scanner;

public class LCS {
	
	public static int lcs(String s1,String s2,int ind1,int ind2,int length) {
		if(ind1>=s1.length() || ind2>=s2.length()) {
			return length;
		}
//		System.out.println(s1.charAt(ind1)==s1.charAt(ind2));
		
		if(s1.charAt(ind1)==s2.charAt(ind2)) {
			 return lcs(s1,s2,ind1+1,ind2+1,length+1);
		}
		else {
			int ans1=lcs(s1,s2,ind1+1,ind2,length);
			int ans2=lcs(s1,s2,ind1,ind2+1,length);
			return Math.max(ans1, ans2);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
//		sc.next();
		String s2=sc.nextLine();
		
		System.out.println(lcs(s1,s2,0,0,0));

	}

}
