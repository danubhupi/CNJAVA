package recursion2;

public class ReplacePI {
	
	public static String replacePI(String s) {
		if(s.length()<=1) {
			return s;
		}
		if(s.charAt(0)=='p'&& s.charAt(1)=='i') {
			return "3.14"+ replacePI(s.substring(2));
		}
		else return s.charAt(0)+replacePI(s.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replacePI("pip"));
		System.out.println(replacePI("pixpi"));
		System.out.println(replacePI("xxpixpxpi"));

	}

}
