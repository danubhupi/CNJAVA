package recursion2;

import java.util.Scanner;

public class ReplaceChar {
	
	public static String replaceChar(String s,int index ,char a,char b) {
		
			if(index>=s.length()) {
				return "";
			}
			String ans="";
			if(s.charAt(index)==a) {
				ans+=b;
			}
			else {
				ans+=s.charAt(index);
			}
			
			return ans+ replaceChar(s,index+1,a,b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		char a=sc.nextLine().charAt(0);

		char b=sc.nextLine().charAt(0);
		System.out.println(replaceChar(s,0,a,b));
		sc.close();
		
		

	}

}
