package recursion3;

public class PrintPermutations {
	
	public static void print(String[] output ) {
		for(String i: output) {
			System.out.println(i);
		}
	}
	
	public static String[] pp(String input) {
		if(input.length()==0) {
			String[] output= {""};
//			System.out.println("yo");
			return output;
			
		}
		
		String[] smallerOutput=pp(input.substring(1));
		String[] output=new String[input.length()*smallerOutput.length];
		
		int k=0;
		for(int i=0;i<smallerOutput.length;i++) {
//			System.out.println("hi");
			String current=smallerOutput[i];
			for(int j=0;j<=current.length();j++) {
//				System.out.println("meow");
				output[k]=current.substring(0,j)+input.charAt(0)+current.substring(j);
				k++;
				
			}
			
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="abc";
		print(pp(input));

	}

}
