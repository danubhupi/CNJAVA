package recursion3;

public class KeypadCombinations {
	
	public static String getString(int n) {
		if(n==2) {
			return "abc";
		}
		if(n==3) {
			return "def";
		}
		if(n==4) {
			return "ghi";
		}
		if(n==5) {
			return "jkl";
		}
		if(n==6) {
			return "mno";
		}
		if(n==7) {
			return "pqrs";
		}
		if(n==8) {
			return "tuv";
		}
		if(n==9) {
			return "wxyz";
		}
		else return " ";
	}
	
	public static int keypad(int n, String[] output) {
		if(n==0) {
			output[0]=" ";
			return 1;
		}
		
		int lastDig=n%10;
		int smallNum=n/10;
		int SOS=keypad(smallNum,output);
		String options=getString(lastDig);
		
		for(int i=0;i<options.length()-1;i++) {
			for(int j=0;j<SOS;j++) {
				output[j+((i+1)*SOS)]=output[j];
			}
		}
		
		int k=0;
		
		for(int i=0;i<options.length();i++) {
			for(int j=0;j<SOS;j++) {
				output[k]=output[k]+options.charAt(i);
				k++;
			}
		}
		
		return SOS*options.length();
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output[]=new String[10000];
		int count=keypad(234,output);
		for(int i=0;i<count;i++) {
			System.out.println(output[i]);
		}
		

	}

}



