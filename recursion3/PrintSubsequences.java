package recursion3;

public class PrintSubsequences {
	
	public static void printSubSeq(String input, String output) {
		
		if(input=="") {
			System.out.println(output);
			return;
		}
		
		printSubSeq(input.substring(1),output);
		printSubSeq(input.substring(1),output+input.charAt(0));
		return;
	
	}
	
	public static void printSubSeq(String input) {
		printSubSeq(input,"");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printSubSeq("xyz");
		

	}

}
