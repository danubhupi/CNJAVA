package recursion2;

public class RemoveX {
	
	public static String removeX(String s) {
		if(s=="") {return s;
			
		}
		if(s.charAt(0)=='x') {
			return removeX(s.substring(1));
			
		}
		 return s.charAt(0)+ removeX(s.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeX("   xxxaaxaa"));

	}

}
