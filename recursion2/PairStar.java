package recursion2;

public class PairStar {
	
	public static String pairStar(String s) {
		if(s.length()<=1) {return s;}
		if(s.charAt(0)==s.charAt(1)) {
			return s.charAt(0)+"*"+pairStar(s.substring(1));
		}
		return s.charAt(0)+pairStar(s.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pairStar("helllallo"));

	}

}
