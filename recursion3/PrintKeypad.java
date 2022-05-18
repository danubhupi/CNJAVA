package recursion3;

public class PrintKeypad {
	
	public static String getString(char n) {
		if(n=='2') {
			return "abc";
		}
		if(n=='3') {
			return "def";
		}
		if(n=='4') {
			return "ghi";
		}
		if(n=='5') {
			return "jkl";
		}
		if(n=='6') {
			return "mno";
		}
		if(n=='7') {
			return "pqrs";
		}
		if(n=='8') {
			return "tuv";
		}
		if(n=='9') {
			return "wxyz";
		}
		else return " ";
	}
	
	public static void helper(String num,String output) {
		if(num=="") {
			System.out.println(output);
			return;
		}
		
		String option=getString(num.charAt(0));
		for(int i=0;i<option.length();i++) {
			helper(num.substring(1),output+option.charAt(i));
			
		}
		return;
	}
	
	
	public static void printKeypad(String num) {
		helper(num,"");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printKeypad("23");

	}

}
