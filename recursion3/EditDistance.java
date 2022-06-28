package recursion3;

import java.util.Scanner;

public class EditDistance {
	
//	public static int ed(StringBuilder s1,StringBuilder s2,int i,int j) {
//		if(s1.equals(s2)) {
//			return 0;
//		}
//		if(i>=s1.length()|| j>=s2.length()) {
//			return 10000;
//		}
//		StringBuilder temp=new StringBuilder();
//		temp.append(s1);
//		
//		StringBuilder stemp= new StringBuilder(); 
//		 stemp.append(s1.substring(0, i)+s1.substring(i+1));
//		int ans1=ed(stemp,s2,i+1,j);
//		int ans2=Integer.MAX_VALUE;
//		int ans3=Integer.MAX_VALUE;
//		if(i<s2.length()) {
//			temp.setCharAt(i,s2.charAt(i));
//			ans2=ed(temp,s2,i+1,j+1);
//			temp=new StringBuilder();
//			temp.append(s1);
//			temp=temp.insert(i,s2.charAt(i));
//			ans3=ed(temp,s2,i,j+1);
//			}
//		int s1Answer=Math.min(ans1, Math.min(ans2, ans3));
//		return 1 +s1Answer;
//		
////		temp=new StringBuilder();
////		temp.append(s2);
////		
////		stemp= new StringBuilder(); 
////		 stemp.append(s1.substring(0, j)+s2.substring(j+1));
////		 ans1=ed(s1,stemp,i,j+1);
////		ans2=Integer.MAX_VALUE;
////		 ans3=Integer.MAX_VALUE;
////		if(j<s1.length()) {
////			temp.setCharAt(j,s1.charAt(j));
////			ans2=ed(s1,temp,i+1,j+1);
////			temp=new StringBuilder();
////			temp.append(s2);
////			temp=temp.insert(j,s1.charAt(j));
////			ans3=ed(s1,temp,i+1,j+1);
////			}
////		int s2Answer=Math.min(ans1, Math.min(ans2, ans3));
//		
////		return 1+(Math.min(s1Answer, s2Answer));
//		
//	}
	
	public static int ed(String s1, String s2) {
		
		// one string becomes empty so number of steps 
		// needed will be equal to the length of remainning strin
		if(s1.equals("")) {
			return s2.length();
		}
		if(s2.equals("")) {
			return s1.length();
		}
		
		//equal chars so no step done
		if(s1.charAt(0)==s2.charAt(0)) {
			return ed(s1.substring(1),s2.substring(1));
		}
		else {
			//if first char deleted then s1 changes but s2 remains same
			int deletion= ed(s1.substring(1),s2);
			//if first char replaced then s1 and s2 move ahead as first char becomes same
			int replacement=ed(s1.substring(1),s2.substring(1));
			//if char added then s1 pointer remains same but s2 pointer moves ahead
			int insertion=ed(s1,s2.substring(1));
	return 1+ Math.min(replacement, Math.min(deletion, insertion) );
	}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1temp=sc.nextLine();
//		sc.next();
		String s2temp=sc.nextLine();
		StringBuilder s1=new StringBuilder(s1temp);
		StringBuilder s2=new StringBuilder(s2temp);
		 System.out.println(ed(s1temp,s2temp));
		

	}

}
