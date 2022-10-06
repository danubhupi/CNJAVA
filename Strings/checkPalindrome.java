package Strings;

public class checkPalindrome {

	public static boolean checkPalindrome(String s)
	{int length=s.length()-1;
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)==s.charAt(length-i)) {
				continue;
			}
			else {
				return false;
			}
		}return true;
		
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(checkPalindrome("myym"));
			

	}

}
